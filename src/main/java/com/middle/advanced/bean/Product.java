package com.middle.advanced.bean;

import lombok.Data;

@Data
public class Product {
    private Long id;

    private String name;

    public Product(){}

    public Product(Long id, String name){
        this.id=id;
        this.name=name;
    }
}
