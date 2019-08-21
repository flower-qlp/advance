package com.middle.advanced.config;

import org.hibernate.dialect.MySQL5Dialect;

public class MySqlUtf8 extends MySQL5Dialect{
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci";
    }
}
