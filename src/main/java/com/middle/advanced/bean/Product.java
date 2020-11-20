package com.middle.advanced.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = -314601843788237870L;

    private Long id;

    private String name;

    public Product() {
    }

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    private String outPrintIndex(int index) {
        return "这是第" + index + "个产品，name=" + name;
    }

    private String outPrintName(String name) {
        return "这是个产品，name=" + name;
    }
}
