package com.middle.advanced.common.model.clone;

import lombok.Data;

@Data
public class PersonClone extends OriginClass {

    private String name;

    private int age;

    public void show() {
        System.out.println("原型模式实现类" + name);
    }
}
