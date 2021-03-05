package com.middle.advanced.common.model.build;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.middle.advanced.common.model.clone.PersonClone;

public class builderTest {
    public static void main(String[] args) {
        Builder builder = new BuildProduct();
        Director director = new Director(builder);
        PersonClone personA = new PersonClone();
        personA.setName("AAA");
        personA.setAge(10);
        PersonClone personB = personA.clone();
        personB.setName("BBB");
        personB.setAge(20);
        PersonClone personC = personA.clone();
        personC.setName("CCC");
        personC.setAge(30);
        Product product = director.construct(null, personB, personC);
        product.show();
        System.out.println(JSON.toJSONString(product, SerializerFeature.WriteMapNullValue));
    }
}
