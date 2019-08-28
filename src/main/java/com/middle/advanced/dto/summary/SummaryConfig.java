package com.middle.advanced.dto.summary;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

@Data
public class SummaryConfig {

    @ApiModelProperty("菜单Id")
    private Long id;

    @ApiModelProperty("页面编码")
    private String summaryConfigCode;

    @ApiModelProperty("标题名称")
    private String summaryConfigName;

    @ApiModelProperty("页面地址")
    private String pagePath;

    @ApiModelProperty("页面名称")
    private String pageTitalName;

    @ApiModelProperty("父级菜单代码")
    private String parentSummaryConfigCode;

    @ApiModelProperty("权限代码")
    private String authorityCode;
}
