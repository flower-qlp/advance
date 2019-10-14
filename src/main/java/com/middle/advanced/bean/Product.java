package com.middle.advanced.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author itoutsource.cz10
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = -314601843788237870L;

    private Long id;

    private String name;

    public Product(){}

    public Product(Long id, String name){
        this.id=id;
        this.name=name;
    }
}
