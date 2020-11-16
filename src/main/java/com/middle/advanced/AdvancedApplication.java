package com.middle.advanced;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.sql.DataSourceDefinition;

@EnableJpaRepositories
@EnableSwagger2
@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = {"com.middle.advanced.mapper"})
public class AdvancedApplication {

    public AdvancedApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(AdvancedApplication.class, args);
    }

}
