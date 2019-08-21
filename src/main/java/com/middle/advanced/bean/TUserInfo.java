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

    @Column(name = "user_id", columnDefinition = "bigint(25) COMMENT '用户Id'",updatable = false)
    private Long userId;

    @Column(name = "user_name_en", columnDefinition = "varchar(25) COMMENT '用户英文名'")
    private String userNameEn;

    @Column(name = "user_name_ch", columnDefinition = "varchar(25) COMMENT '用户中文名'")
    private String userNameCh;

    @Column(name = "nick_name", columnDefinition = "varchar(25) COMMENT '昵称'")
    private String nickName;

    @Column(name = "sex", columnDefinition = "tinyint(1) COMMENT '性别'")
    private Boolean sex;

    @Column(name = "age", columnDefinition = "int(3) COMMENT '年龄'")
    private Integer age;

    @Column(name = "tel", columnDefinition = "varchar(20) COMMENT '手机号'")
    private String tel;

}
