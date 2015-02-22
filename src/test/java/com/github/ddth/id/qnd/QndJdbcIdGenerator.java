package com.github.ddth.id.qnd;

import com.github.ddth.id.JdbcIdGenerator;

public class QndJdbcIdGenerator {

    public static void main(String[] args) {
        JdbcIdGenerator idGenerator = JdbcIdGenerator.getInstance("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost:3306/temp", "test", "test", "ddth_id");
        System.out.println(idGenerator.currentId("default"));
        System.out.println(idGenerator.nextId("default"));
        System.out.println(idGenerator.currentId("default"));
        System.out.println(idGenerator.nextId("default"));
        System.out.println(idGenerator.currentId("default"));
    }
}
