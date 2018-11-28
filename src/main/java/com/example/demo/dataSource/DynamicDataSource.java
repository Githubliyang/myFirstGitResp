package com.example.demo.dataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by li on 2018/11/27.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    //使用DatabaseContextHolder容器拿到当前的数据源类型DatabaseType
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }
}
