package com.middle.advanced.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "t_summary_config")
public class TSummaryConfig extends BaseEntity implements Serializable{

    @Column(name = "summary_config_code", columnDefinition = "varchar(30) COMMENT '页面编码'")
    private String summaryConfigCode;

    @Column(name = "summary_config_name", columnDefinition = "varchar(100) COMMENT '标题名称'")
    private String summaryConfigName;

    @Column(name = "page_path", columnDefinition = "varchar(200) comment '页面地址'")
    private String pagePath;

    @Column(name = "page_title_name", columnDefinition = "varchar(200) comment '页面名称'")
    private String pageTitalName;

    @Column(name = "summary_config_code_parent", columnDefinition = "varchar(30) comment '父级菜单代码'")
    private String parentSummaryConfigCode;

    @Column(name = "authority_code", columnDefinition = "varchar(10) COMMENT '权限代码'")
    private String authorityCode;

}
