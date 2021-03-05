package com.middle.advanced.common.model.factory.methodFactory;

import lombok.Data;

import java.util.List;

/**
 * @author itoutsource.cz10
 */
@Data
public abstract class AbstractUser {
    private String name;
    private String empNo;
    private List<Integer> roles;
    private List<String> loanCode;

    public AbstractUser() {
    }

    public AbstractUser(String name, String empNo) {
        this.name = name;
        this.empNo = empNo;
    }

}
