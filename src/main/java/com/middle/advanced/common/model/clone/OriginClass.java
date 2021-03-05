package com.middle.advanced.common.model.clone;

/**
 * 基于内存二进制的复制
 **/
public class OriginClass implements Cloneable {

    @Override
    public OriginClass clone() {
        OriginClass originClass = null;
        try {
            originClass = (OriginClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return originClass;
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
