package com.middle.advanced.common.model.singleton;

import lombok.Getter;

/**
 * 枚举类 单例模式
 * 不能懒加载
 **/
@Getter
public enum RoleSingleton {
    EMP(17, "业务员"),
    FINANCING(124, "财务"),
    FINANCING_HEAD(20, "财务长"),
    CUSTOMER(-1, "经销商"),
    USER(-2, "用户"),
    SUPPORT(33, "渠道商");

    private Integer code;

    private String message;

    RoleSingleton(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage(Integer code) {
        for (RoleSingleton statusSingleton : RoleSingleton.values()) {
            if (statusSingleton.code.equals(code)) {
                return statusSingleton.message;
            }
        }
        return "";
    }


}
