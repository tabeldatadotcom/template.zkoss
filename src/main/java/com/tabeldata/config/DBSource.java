package com.tabeldata.config;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class DBSource {

    private final static String url = "jdbc:postgresql://localhost:5432/db_zk";
    private final static String user = "postgres";
    private final static String passwd = "admin";
    private final static String driverClassName = "org.postgresql.Driver";

    public static DataSource getDatasource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(user);
        dataSource.setPassword(passwd);
        return dataSource;
    }
}
