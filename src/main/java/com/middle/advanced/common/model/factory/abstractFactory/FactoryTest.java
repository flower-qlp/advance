package com.middle.advanced.common.model.factory.abstractFactory;

import com.alibaba.fastjson.JSON;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory=new CattleFactory();
        CattleBaseInfo cattleBaseInfo=(CattleBaseInfo)factory.createBaseInfo(null);
        factory.createProduct(null);
        factory.createUser(null);
        System.out.println(JSON.toJSONString(cattleBaseInfo));

    }
}
