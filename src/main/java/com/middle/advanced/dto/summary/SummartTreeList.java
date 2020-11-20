package com.middle.advanced.dto.summary;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author
 */
@Data
public class SummartTreeList extends ParentSummaryList implements Serializable{

    @ApiModelProperty("子菜单列表")
    private List<ParentSummaryList> childSummary;
}
