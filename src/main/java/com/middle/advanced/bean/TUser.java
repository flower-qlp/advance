package com.middle.advanced.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "t_user")
public class TUser extends BaseEntity {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_code")
    private String userCode;

    @Column(name = "password")
    private String passWord;

}
