package com.github.ddth.id.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;

import redis.embedded.RedisServer;

import com.github.ddth.id.RedisIdGenerator;
import com.github.ddth.redis.IRedisClient;
import com.github.ddth.redis.RedisClientFactory;

/**
 * Test case for {@link RedisIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.2.0
 */
public class TestRedisIdGenerator extends TestCase {

    protected final static String REDIS_HOST = "localhost";
    protected final static int REDIS_PORT = 16379;
    private RedisServer redisServer;
    private RedisIdGenerator idGenerator;

    public static Test suite() {
        return new TestSuite(TestRedisIdGenerator.class);
    }

    @Before
    public void setUp() throws Exception {
        redisServer = RedisServer.builder().port(REDIS_PORT).setting("daemonize no")
                .setting("save \"\"").build();
        redisServer.start();
        RedisClientFactory redisFactory = RedisClientFactory.newFactory();
        boolean done = true;
        do {
            IRedisClient redisClient = redisFactory.getRedisClient(REDIS_HOST, REDIS_PORT);
            if (redisClient != null) {
                try {
                    redisClient.ping();
                } catch (Exception e) {
                    done = false;
                } finally {
                    redisClient.close();
                }
            }
        } while (!done);
        redisFactory.destroy();

        idGenerator = RedisIdGenerator.getInstance("localhost", REDIS_PORT);
    }

    @After
    public void tearDown() throws Exception {
        redisServer.stop();
        Thread.sleep(5000);
        RedisClientFactory redisFactory = RedisClientFactory.newFactory();
        boolean done = false;
        do {
            try {
                Socket socket = new Socket(REDIS_HOST, REDIS_PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("ping");
                out.close();
                socket.close();
            } catch (IOException e) {
                done = true;
            }
        } while (!done);
        redisFactory.destroy();

        Thread.sleep(5000);
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
