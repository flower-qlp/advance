package com.middle.advanced.test;

import com.middle.advanced.bean.Product;

import java.util.Optional;

import static com.middle.advanced.utils.BaseUtile.alertMsg;


/***
 * java8 optional
 * **/
public class OptionalTest {

    public static void main(String[] args) {
        //对象为空的情况
        Product p1 = null;
        String userName = null;
        Product p2 = new Product(1L, "鲁飞");
        Optional.ofNullable(p1).isPresent();

        //判断p1是否为空 否则返回p2
        Product result = Optional.ofNullable(p1).orElse(p2);

        alertMsg(result.getName());

        //map获取对象中的值
        String name = Optional.ofNullable(p1).map(x -> x.getName()).orElse("1106275@qq.com");


        alertMsg(name);

        //抛出异常
        Optional.ofNullable(userName).orElseThrow(() -> new RuntimeException("userName is null"));

    }
}
