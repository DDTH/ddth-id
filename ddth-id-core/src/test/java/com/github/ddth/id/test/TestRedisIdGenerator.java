package com.github.ddth.id.test;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.SerialIdGenerator;
import com.github.ddth.id.redis.RedisIdGenerator;

import junit.framework.Test;
import junit.framework.TestSuite;
import redis.clients.jedis.Jedis;

/**
 * Test case for {@link RedisIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public class TestRedisIdGenerator extends BaseTest {

    public static Test suite() {
        return new TestSuite(TestRedisIdGenerator.class);
    }

    private class MyRedisIdGenerator extends RedisIdGenerator {
        public void initData() throws SQLException {
            try (Jedis jedis = getJedis()) {
                jedis.flushAll();
                jedis.set(NAMESPACE, "0");
            }
        }
    }

    @Override
    protected SerialIdGenerator createSerialIdGenerator() throws SQLException {
        if (System.getProperty("enableTestsRedis") == null) {
            return null;
        }

        String hostAndPort = System.getProperty("hostAndPort");
        if (StringUtils.isBlank(hostAndPort)) {
            hostAndPort = "localhost:6379";
        }
        String password = System.getProperty("password");

        MyRedisIdGenerator idGen = new MyRedisIdGenerator();
        idGen.setRedisHostAndPort(hostAndPort).setRedisPassword(password);
        idGen.init();
        idGen.initData();
        return idGen;
    }
}
