package com.middle.advanced.common.model.clone;

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
}
