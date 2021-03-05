package com.middle.advanced.common.model.clone;

import java.util.Date;

public class CloneTest {
    public static void main(String[] args) {
        //原型模式
        PersonClone p = new PersonClone();
        p.setName("good");
        p.setDate(new Date());

        PersonClone p2 = null;

        p2 = p.clone();

        System.out.println(p.getName() == p2.getName());
        System.out.println(p.getDate() == p2.getDate());


//        System.out.println(System.currentTimeMillis());
//        for (int i = 0; i < 10000; i++) {
//            PersonClone cloneP = (PersonClone) p.clone();
////          PersonClone cloneP = new PersonClone();
////          BeanUtils.copyProperties(p, cloneP);
//            cloneP.setName(cloneP.getName() + i);
//            cloneP.show();
//        }
//        System.out.println(System.currentTimeMillis());
    }
}
