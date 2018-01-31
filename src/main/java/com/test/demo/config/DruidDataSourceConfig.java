/**
 * www.mopaas.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */
package com.test.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidDataSourceConfig {
@Bean(name="primaryDataSource")
@Primary
@ConfigurationProperties(prefix="spring.datasource.primary")
public DataSource primaryDataSource() {
    System.out.println("-------------------- primaryDataSource init ---------------------");
    return new DruidDataSource();
}

@Bean(name="secondaryDataSource")
@ConfigurationProperties(prefix="spring.datasource.secondary")
public DataSource secondaryDataSource() {
    System.out.println("-------------------- secondaryDataSource init ---------------------");
    return new DruidDataSource();
}

}
