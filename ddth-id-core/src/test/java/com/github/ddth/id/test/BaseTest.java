package com.github.ddth.id.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;

import com.github.ddth.id.SerialIdGenerator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public abstract class BaseTest extends TestCase {

    protected SerialIdGenerator idGen;
    protected final static String NAMESPACE = "default";

    public static Test suite() {
        return new TestSuite(BaseTest.class);
    }

    protected abstract SerialIdGenerator createSerialIdGenerator() throws Exception;

    @Before
    public void setUp() throws Exception {
        idGen = createSerialIdGenerator();
    }

    @After
    public void tearDown() throws Exception {
        if (idGen != null) {
            idGen.destroy();
        }
    }

    @org.junit.Test
    public void testNewNamespaceShouldStartAtZero() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = "ddth-id-" + String.valueOf(System.nanoTime());
        assertEquals(0, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
    }

    @org.junit.Test
    public void testSetValue() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = NAMESPACE;

        assertTrue(idGen.setValueWithRetries(namespace, 1, 5, TimeUnit.SECONDS));
        assertEquals(1, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));

        long value = System.currentTimeMillis();
        assertTrue(idGen.setValueWithRetries(namespace, value, 5, TimeUnit.SECONDS));
        assertEquals(value, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
    }

    @org.junit.Test
    public void testSetValue2() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = "ddth-id-" + String.valueOf(System.nanoTime());

        assertTrue(idGen.setValueWithRetries(namespace, 1, 5, TimeUnit.SECONDS));
        assertEquals(1, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));

        long value = System.currentTimeMillis();
        assertTrue(idGen.setValueWithRetries(namespace, value, 5, TimeUnit.SECONDS));
        assertEquals(value, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
    }

    @org.junit.Test
    public void testNextValue() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = NAMESPACE;

        for (int i = 0; i < 10; i++) {
            assertEquals(i, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
            assertEquals(i + 1, idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS));
        }
    }

    @org.junit.Test
    public void testNextValue2() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = NAMESPACE;

        for (int i = 0; i < 10; i++) {
            assertEquals(i, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
            assertEquals(i + 1, idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS));
        }
    }

    @org.junit.Test
    public void testSetValueNextValue() throws Exception {
        if (idGen == null) {
            return;
        }

        String namespace = NAMESPACE;

        for (int i = 0; i < 10; i++) {
            assertTrue(idGen.setValueWithRetries(namespace, i * 2, 5, TimeUnit.SECONDS));
            assertEquals(i * 2, idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
            assertEquals(i * 2 + 1, idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS));
        }
    }

    protected int numThreads() {
        return 8;
    }

    protected int numValuesPerThread() {
        return 1000;
    }

    public void testMultiThreads() throws Exception {
        if (idGen == null) {
            return;
        }
        // if (true)
        // return;

        int numThreads = numThreads();
        int numValuesPerThreads = numValuesPerThread();
        String namespace = NAMESPACE;
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread() {
                public void run() {
                    for (int i = 0; i < numValuesPerThreads; i++) {
                        idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS);
                    }
                }
            };
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(numValuesPerThreads * numThreads, idGen.currentId(namespace));
    }

    public void testMultiThreads2() throws Exception {
        if (idGen == null) {
            return;
        }
        // if (true)
        // return;

        int numThreads = numThreads();
        int numValuesPerThreads = numValuesPerThread();
        String namespace = "ddth-id-" + String.valueOf(System.nanoTime());
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread() {
                public void run() {
                    for (int i = 0; i < numValuesPerThreads; i++) {
                        idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS);
                    }
                }
            };
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(numValuesPerThreads * numThreads, idGen.currentId(namespace));
    }
}
