package com.middle.advanced.common.model.factory.methodFactory;

import com.middle.advanced.common.model.singleton.RoleSingleton;

import java.util.Arrays;

import static com.middle.advanced.common.model.singleton.RoleSingleton.SUPPORT;

public class SupportFactory implements AbstractFactory {
    @Override
    public AbstractUser newUser(String name) {
        Support s = new Support(name);
        s.setRoles(Arrays.asList(SUPPORT.getCode()));
        return s;
    }
}
