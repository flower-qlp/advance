package com.middle.advanced.bean;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "t_user_info")
public class TUserInfo extends BaseEntity {

    @Column(name = "user_id",columnDefinition = "bigint(25) COMMENT '用户Id'")
    private Long userId;

    @Column(name = "user_name_en")
    private String userNameEn;

    @Column(name = "user_name_ch")
    private String userNameCh;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "sex")
    private Boolean sex;

    @Column(name = "age")
    private Integer age;

    @Column(name = "tel")
    private String tel;

}
