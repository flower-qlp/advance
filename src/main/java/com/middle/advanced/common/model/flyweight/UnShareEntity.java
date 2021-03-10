package com.middle.advanced.common.model.flyweight;

import lombok.Data;

@Data
public class UnShareEntity {
    private String info;

    public UnShareEntity() {
    }

    public UnShareEntity(String info) {
        this.info = info;
    }
}
