package com.github.ddth.id.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.curator.test.TestingServer;
import org.junit.After;
import org.junit.Before;

import com.github.ddth.id.ZookeeperIdGenerator;

/**
 * Test case for {@link ZookeeperIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.2.0
 */
public class TestZookeeperIdGenerator extends TestCase {

    private TestingServer zkServer;
    private ZookeeperIdGenerator idGenerator;

    public static Test suite() {
        return new TestSuite(TestZookeeperIdGenerator.class);
    }

    @Before
    public void setUp() throws Exception {
        zkServer = new TestingServer();
        zkServer.start();
        Thread.sleep(1000);

        idGenerator = ZookeeperIdGenerator.getInstance(zkServer.getConnectString());
    }

    @After
    public void tearDown() throws Exception {
        zkServer.close();
        Thread.sleep(1000);
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
    }
}
