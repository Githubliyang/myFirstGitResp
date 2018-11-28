package com.example.demo.dataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by li on 2018/11/26.
 */
@Configuration//标志配置类
public class dataSourceConfig {

    // 配置多个数据源
    @Bean(name = "mainDataSource")
    @Qualifier("mainDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.datasource01")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cityDataSource")
    @Qualifier("cityDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.datasource02")
    public DataSource secondDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary//默认加载的数据源
    public DynamicDataSource dataSource(@Qualifier("cityDataSource") DataSource cityDataSource,
                                        @Qualifier("mainDataSource") DataSource mainDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DatabaseType.test, cityDataSource);
        targetDataSources.put(DatabaseType.test2, mainDataSource);
        //key value形式保存对应的数据库
        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
        dataSource.setDefaultTargetDataSource(mainDataSource);// 默认的datasource设置为myTestDbDataSource

        return dataSource;
    }


}
