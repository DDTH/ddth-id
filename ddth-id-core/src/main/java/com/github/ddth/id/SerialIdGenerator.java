package com.github.ddth.id;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/**
 * Generate serial IDs.
 * 
 * <p>
 * Serial IDs are:
 * </p>
 * <ul>
 * <li>Grouped into namespaces.</li>
 * <li>Unique within the namespace.</li>
 * <li>Ascending and Serial: {@code next_id = previous_id + 1}.</li>
 * <li>Persistency: depends on implementation of concrete sub-classes</li>
 * </ul>
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.1.0
 */
public abstract class SerialIdGenerator implements Closeable, AutoCloseable {

    protected static Cache<String, SerialIdGenerator> idGenerators = CacheBuilder.newBuilder()
            .expireAfterAccess(3600, TimeUnit.SECONDS)
            .removalListener(new RemovalListener<String, SerialIdGenerator>() {
                @Override
                public void onRemoval(RemovalNotification<String, SerialIdGenerator> entry) {
                    entry.getValue().destroy();
                }
            }).build();

    /**
     * Invalidates all cached {@link SerialIdGenerator}.
     * 
     * @since 0.4.0
     */
    public static void invalidate() {
        idGenerators.invalidateAll();
    }

    public SerialIdGenerator init() {
        return this;
    }

    public void destroy() {
        // EMPTY
    }

    /**
     * @since 0.5.0
     */
    public void close() {
        destroy();
    }

    /**
     * Generates next id.
     * 
     * @return next id for the specified namespace as a long, {@code 0} if not
     *         supported or invalid namespace, negative value if error.
     */
    public abstract long nextId(String namespace);

    /**
     * Generates next id, retries till successful or timed-out.
     * 
     * @param namespace
     * @param timeout
     * @param timeoutUnit
     * @return
     * @since 0.5.0
     */
    public long nextIdWithRetries(String namespace, long timeout, TimeUnit timeoutUnit) {
        long timestamp = System.currentTimeMillis();
        long timeoutMs = timeoutUnit.toMillis(timeout);
        long nextId = nextId(namespace);
        while (nextId < 0 && System.currentTimeMillis() - timestamp <= timeoutMs) {
            nextId = nextId(namespace);
        }
        return nextId;
    }

    /**
     * Gets current id.
     * 
     * @param namespace
     * @return current id for the specified namespace as long, negative value if
     *         error.
     * @since 0.2.0
     */
    public abstract long currentId(String namespace);

    /**
     * Gets current id, retries till successful or timed-out.
     * 
     * @param namespace
     * @param timeout
     * @param timeoutUnit
     * @return
     * @since 0.5.0
     */
    public long currentIdWithRetries(String namespace, long timeout, TimeUnit timeoutUnit) {
        long timestamp = System.currentTimeMillis();
        long timeoutMs = timeoutUnit.toMillis(timeout);
        long currentId = currentId(namespace);
        while (currentId < 0 && System.currentTimeMillis() - timestamp <= timeoutMs) {
            currentId = currentId(namespace);
        }
        return currentId;
    }

    /**
     * Sets an id's value.
     * 
     * @param namespace
     * @param value
     * @return
     * @since 0.4.0
     */
    public abstract boolean setValue(String namespace, long value);

    /**
     * Sets an id's value, retries till successful or timed-out.
     * 
     * @param namespace
     * @param value
     * @param timeout
     * @param timeoutUnit
     * @return
     * @since 0.5.0
     */
    public boolean setValueWithRetries(String namespace, long value, long timeout,
            TimeUnit timeoutUnit) {
        long timestamp = System.currentTimeMillis();
        long timeoutMs = timeoutUnit.toMillis(timeout);
        boolean result = setValue(namespace, value);
        while (!result && System.currentTimeMillis() - timestamp <= timeoutMs) {
            result = setValue(namespace, value);
        }
        return result;
    }
}
