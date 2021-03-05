package com.middle.advanced.common.model.factory.methodFactory;

public class EmpFactory implements AbstractFactory {
    @Override
    public AbstractUser newUser(String name) {
        return new Emp(name, "1234");
    }
}
