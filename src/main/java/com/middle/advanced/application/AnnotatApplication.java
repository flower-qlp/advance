package com.middle.advanced.application;

import com.middle.advanced.bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AnnotatApplication {

    public void getBean(){
        ApplicationContext context=new AnnotationConfigApplicationContext(Bean.class);
        Product product=context.getBean("product",Product.class);

    }

}
