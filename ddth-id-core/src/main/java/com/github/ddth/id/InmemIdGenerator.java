package com.github.ddth.id;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ddth.id.utils.IdException;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * This id generator generates in-memory IDs, which are not persistent between
 * JVM restarts.
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public class InmemIdGenerator extends SerialIdGenerator {

    private static Logger LOGGER = LoggerFactory.getLogger(InmemIdGenerator.class);

    private LoadingCache<String, AtomicLong> counters;

    /**
     * {@inheritDoc}
     */
    @Override
    public InmemIdGenerator init() {
        if (counters == null) {
            counters = CacheBuilder.newBuilder().build(new CacheLoader<String, AtomicLong>() {
                @Override
                public AtomicLong load(String key) throws Exception {
                    return new AtomicLong(0);
                }
            });
        }

        super.init();

        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroy() {
        try {
            super.destroy();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }

        if (counters != null) {
            try {
                counters.invalidateAll();
            } catch (Exception e) {
                LOGGER.warn(e.getMessage(), e);
            } finally {
                counters = null;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long nextId(String namespace) {
        try {
            return counters.get(namespace).incrementAndGet();
        } catch (ExecutionException e) {
            LOGGER.warn(e.getMessage(), e);
            return -1;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long currentId(String namespace) {
        try {
            return counters.get(namespace).get();
        } catch (ExecutionException e) {
            LOGGER.warn(e.getMessage(), e);
            return -1;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setValue(String namespace, long value) {
        if (value < 0) {
            throw new IdException("Id value must be greater or equal to 0!");
        }
        try {
            counters.get(namespace).set(value);
            return true;
        } catch (ExecutionException e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        }
    }
}