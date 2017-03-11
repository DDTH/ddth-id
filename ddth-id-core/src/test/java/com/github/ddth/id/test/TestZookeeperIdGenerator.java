package com.github.ddth.id.test;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.SerialIdGenerator;
import com.github.ddth.id.zookeeper.ZookeeperIdGenerator;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test case for {@link ZookeeperIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.2.0
 */
public class TestZookeeperIdGenerator extends BaseTest {

    public static Test suite() {
        return new TestSuite(TestZookeeperIdGenerator.class);
    }

    private class MyZkIdGenerator extends ZookeeperIdGenerator {
        public void initData() throws SQLException {
            setValue(NAMESPACE, 0);
        }
    }

    @Override
    protected SerialIdGenerator createSerialIdGenerator() throws SQLException {
        if (System.getProperty("enableTestsZookeeper") == null
                && System.getProperty("enableTestsZk") == null
                && System.getProperty("enableTestsZooKeeper") == null) {
            return null;
        }

        String zkConnStr = System.getProperty("zkConnStr");
        if (StringUtils.isBlank(zkConnStr)) {
            zkConnStr = "localhost:2181/ddth-id";
        }

        MyZkIdGenerator idGen = new MyZkIdGenerator();
        idGen.setZookeeperConnString(zkConnStr);
        idGen.init();
        idGen.initData();
        return idGen;
    }
}
