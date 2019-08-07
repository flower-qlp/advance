package com.middle.advanced.bean.content;

import com.middle.advanced.bean.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanProduct {

    @Bean(name = "product")
    public Product build() {
        Product product = new Product();
        product.setId(1L);
        product.setName("fei.lu");
        return product;
    }
}
