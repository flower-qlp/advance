package com.middle.advanced.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author itoutsource.cz10
 */
@Entity
@Data
@Table(name = "t_user")
public class TUser extends BaseEntity {


    @Column(name = "user_name",length = 64)
    private String userName;

    @Column(name = "user_code",length = 20)
    private String userCode;

    @Column(name = "password",length = 30)
    private String passWord;

}
