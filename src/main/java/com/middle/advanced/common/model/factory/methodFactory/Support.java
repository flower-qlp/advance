package com.middle.advanced.common.model.factory.methodFactory;

public class Support extends AbstractUser {

    public Support() {
        super();
    }

    public Support(String name) {
        super(name, null);
    }

    public void show() {
        System.out.println("支持审批！");
    }
}
