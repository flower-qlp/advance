package com.middle.advanced.common.model.build;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class Product {
    private Object partA;

    private Object partB;

    private Object partC;

    public void show() {
        System.out.println(JSON.toJSONString(this.partA));
        System.out.println(JSON.toJSONString(this.partB));
        System.out.println(JSON.toJSONString(this.partC));
    }

}
