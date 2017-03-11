package com.github.ddth.id.test;

import com.github.ddth.id.InmemIdGenerator;
import com.github.ddth.id.SerialIdGenerator;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test case for {@link InmemIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public class TestInmemIdGenerator extends BaseTest {

    public static Test suite() {
        return new TestSuite(TestInmemIdGenerator.class);
    }

    private class MyInmemIdGenerator extends InmemIdGenerator {
        public void initData() {
            setValue(NAMESPACE, 0);
        }
    }

    @Override
    protected SerialIdGenerator createSerialIdGenerator() {
        MyInmemIdGenerator idGen = new MyInmemIdGenerator();
        idGen.init();
        idGen.initData();
        return idGen;
    }
}
