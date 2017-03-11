package com.github.ddth.id.qnd;

import com.github.ddth.id.SnowflakeIdGenerator;

public class QndSnowflakeIdGenerator2 {

    public static void main(String[] args) {
        SnowflakeIdGenerator idGen = SnowflakeIdGenerator.getInstance(12345);
        System.out.println(idGen.generateId128());
        System.out.println(idGen.generateId128().toString(16));
    }
}
