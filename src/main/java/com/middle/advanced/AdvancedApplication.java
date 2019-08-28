package com.middle.advanced;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
@EnableCaching
public class AdvancedApplication {

    public AdvancedApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(AdvancedApplication.class, args);
    }

}
