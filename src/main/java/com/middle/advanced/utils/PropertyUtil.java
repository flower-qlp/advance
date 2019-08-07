package com.middle.advanced.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author itoutsource.cz10
 * java8.0和spring boot4.0增加对重复注解的支持
 */
@PropertySource("classpath:/mime.properties")
@PropertySource("classpath:/application.properties")
@Data
@Component
public class PropertyUtil {

    @Value("${properties.name}")
    public String name;

    @Value("${mine.properties.name}")
    public String myName;

}
