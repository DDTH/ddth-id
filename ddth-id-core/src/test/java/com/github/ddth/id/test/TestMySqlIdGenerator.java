package com.github.ddth.id.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import com.github.ddth.id.SerialIdGenerator;
import com.github.ddth.id.jdbc.JdbcIdGenerator;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test case for {@link JdbcIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public class TestMySqlIdGenerator extends BaseTest {

    public static Test suite() {
        return new TestSuite(TestMySqlIdGenerator.class);
    }

    private class MyJdbcIdGenerator extends JdbcIdGenerator {
        public void initData() throws SQLException {
            Connection conn = getDbConnection();
            try {
                JdbcTemplate jdbcTemplate = createJdbcTemplate(conn);
                jdbcTemplate.update("DELETE FROM " + getTableName());
                jdbcTemplate.update("INSERT INTO " + getTableName() + " (" + getTableColumnName()
                        + "," + getTableColumnValue() + ") VALUES ('" + NAMESPACE + "', 0)");
            } finally {
                conn.close();
            }
        }
    }

    @Override
    protected SerialIdGenerator createSerialIdGenerator() throws SQLException {
        if (System.getProperty("enableTestsMySQL") == null
                && System.getProperty("enableTestsMySql") == null
                && System.getProperty("enableTestsMYSQL") == null) {
            return null;
        }

        String jdbcUrl = System.getProperty("url"), jdbcUser = System.getProperty("user"),
                jdbcPassword = System.getProperty("password");
        if (StringUtils.isBlank(jdbcUrl)) {
            jdbcUrl = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Ho_Chi_Minh";
        }
        if (StringUtils.isBlank(jdbcUser)) {
            jdbcUser = "test";
        }
        if (StringUtils.isBlank(jdbcPassword)) {
            jdbcPassword = "test";
        }

        MyJdbcIdGenerator idGen = new MyJdbcIdGenerator();
        idGen.setJdbcDriverClass("com.mysql.cj.jdbc.Driver").setJdbcUrl(jdbcUrl)
                .setJdbcUser(jdbcUser).setJdbcPassword(jdbcPassword);
        idGen.setTableName("ddth_id").init();
        idGen.initData();
        return idGen;
    }

}
