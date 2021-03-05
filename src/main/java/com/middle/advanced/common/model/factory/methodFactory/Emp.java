package com.middle.advanced.common.model.factory.methodFactory;

public class Emp extends AbstractUser {

    public Emp() {
        super();
    }

    public Emp(String name, String empNo) {
        super(name, empNo);
    }

    public void show() {
        System.out.println("业务员支持审批！");
    }

}
