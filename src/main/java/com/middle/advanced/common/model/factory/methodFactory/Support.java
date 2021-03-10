package com.middle.advanced.common.model.factory.methodFactory;

import lombok.Data;

@Data
public class Support extends AbstractUser {

    private String className="ccc";

    public Support() {
        super();
    }

    public Support(String name) {
        super(name, null);
    }

    public void show() {
        System.out.println(this.className + "支持审批！");
    }
}
