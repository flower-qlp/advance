package com.middle.advanced.common.model.factory.methodFactory;

import com.alibaba.fastjson.JSON;

public class MethodFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new SupportFactory();
        Support user = (Support) factory.newUser("颜唯杰");
        System.out.println(JSON.toJSONString(user));
        user.show();
    }
}
