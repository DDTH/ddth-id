package com.github.ddth.id.test;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;

import com.github.ddth.id.JdbcIdGenerator;
import com.mysql.management.MysqldResource;
import com.mysql.management.MysqldResourceI;

/**
 * Test case for {@link JdbcIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.3.0
 */
public class TestJdbcIdGenerator extends TestCase {

    protected File MYSQL_DIR;
    protected String MYSQL_DB = "temp";
    protected int MYSQL_PORT = 13306;
    protected String MYSQL_USER = "root";
    protected String MYSQL_PASSWORD = "secret";
    protected MysqldResource MYSQLD;
    protected DataSource dataSource;
    protected JdbcIdGenerator idGenerator;

    public static Test suite() {
        return new TestSuite(TestJdbcIdGenerator.class);
    }

    private void startDb() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        MYSQL_DIR = new File(tempDir, RandomStringUtils.randomAlphanumeric(8));

        MYSQLD = new MysqldResource(MYSQL_DIR);
        Map<String, Object> dbOptions = new HashMap<String, Object>();
        dbOptions.put(MysqldResourceI.PORT, Integer.toString(MYSQL_PORT));
        dbOptions.put(MysqldResourceI.INITIALIZE_USER, "true");
        dbOptions.put(MysqldResourceI.INITIALIZE_USER_NAME, MYSQL_USER);
        dbOptions.put(MysqldResourceI.INITIALIZE_PASSWORD, MYSQL_PASSWORD);

        MYSQLD.start("test-mysqld-thread", dbOptions);
        if (!MYSQLD.isRunning()) {
            throw new RuntimeException("MySQL did not start.");
        }
        System.out.println("MySQL is running.");
    }

    private void stopDb() {
        if (MYSQLD != null) {
            try {
                MYSQLD.shutdown();
            } finally {
                MYSQLD = null;
            }
        }
        if (MYSQL_DIR != null) {
            try {
                FileUtils.deleteDirectory(MYSQL_DIR);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Before
    public void setUp() throws Exception {
        startDb();

        final String jdbcDriver = "com.mysql.jdbc.Driver";
        final String jdbcUrl = "jdbc:mysql://localhost:" + MYSQL_PORT + "/" + MYSQL_DB + "?"
                + "createDatabaseIfNotExist=true";
        final String jdbcUser = MYSQL_USER;
        final String jdbcPassword = MYSQL_PASSWORD;

        // setup datasource
        {
            BasicDataSource ds = new BasicDataSource();
            ds.setDriverClassName(jdbcDriver);
            ds.setUrl(jdbcUrl);
            ds.setUsername(jdbcUser);
            ds.setPassword(jdbcPassword);

            dataSource = ds;
        }

        // create table schema
        {
            Connection conn = dataSource.getConnection();
            try {
                String SQL = "CREATE TABLE ddth_id (" + "id_name VARCHAR(32) NOT NULL, "
                        + "id_value BIGINT NOT NULL DEFAULT 0, " + "PRIMARY KEY (id_name)) "
                        + "ENGINE=InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci";
                conn.createStatement().executeUpdate(SQL);
            } finally {
                conn.close();
            }
        }

        idGenerator = JdbcIdGenerator.getInstance(jdbcDriver, jdbcUrl, jdbcUser, jdbcPassword,
                "ddth_id");
    }

    @After
    public void tearDown() throws Exception {
        stopDb();
    }

    @org.junit.Test
    public void test1() throws Exception {
        assertEquals(0, idGenerator.currentId("default"));
    }

    @org.junit.Test
    public void test2() throws Exception {
        assertEquals(1, idGenerator.nextId("default"));
        assertEquals(2, idGenerator.nextId("default"));
    }

    @org.junit.Test
    public void test3() throws Exception {
        assertEquals(0, idGenerator.currentId("default"));
        assertEquals(1, idGenerator.nextId("default"));
        assertEquals(1, idGenerator.currentId("default"));
        assertEquals(2, idGenerator.nextId("default"));
        assertEquals(2, idGenerator.currentId("default"));
    }
}
