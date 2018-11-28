package com.example.demo.dataSource;

/**
 * Created by li on 2018/11/27.
 */
public class DatabaseContextHolder {
    //写一个database的容器
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
    }

    public static DatabaseType getDatabaseType() {
        return contextHolder.get();
    }
}

