package com.middle.advanced.dto.summary;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单树
 *
 * @author itoutsource.cz10
 */
@Data
public class ParentSummaryList implements Serializable {

    @ApiModelProperty(value = "页面编码")
    private String summaryConfigCode;

    @ApiModelProperty("标题名称")
    private String summaryConfigName;

    @ApiModelProperty("页面地址")
    private String pagePath;

    @ApiModelProperty("页面名称")
    private String pageTitalName;

    public ParentSummaryList() {
    }

    public ParentSummaryList(String summaryConfigCode, String summaryConfigName, String pagePath, String pageTitalName) {
        this.pagePath = pagePath;
        this.pageTitalName = pageTitalName;
        this.summaryConfigCode = summaryConfigCode;
        this.summaryConfigName = summaryConfigName;
    }


}
