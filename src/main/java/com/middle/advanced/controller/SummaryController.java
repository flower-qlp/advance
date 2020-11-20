package com.middle.advanced.controller;

import com.middle.advanced.dto.ResponseDto;
import com.middle.advanced.dto.summary.SummaryConfig;
import com.middle.advanced.service.SummaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 */
@RestController
@Api(value = "/", tags = "page")
@RequestMapping(value = "/summary")
public class SummaryController extends BaseController {

    @Autowired
    private SummaryService summaryService;

    @ApiOperation(value = "保存菜单信息")
    @PostMapping(value = "/save/summaryConfig")
    public ResponseDto saveSummaryConfig(
            @RequestBody SummaryConfig summaryConfig
    ) {
        return buildResponse10000(null, summaryService.saveSummaryConfig(summaryConfig));

    }

    @ApiOperation(value = "获取所有父级菜单")
    @GetMapping(value = "/all/parent/list")
    public ResponseDto pageParentList() {
        return buildResponse10000(null, summaryService.pageParentList());
    }


    @ApiOperation(value = "根据父级获取子菜单")
    @GetMapping(value = "/all/{parentCode}/list")
    public ResponseDto pageChildList(
            @ApiParam(value = "parentCode") @RequestParam(value = "parentCode") String parentCode
    ) {
        return buildResponse10000(null, summaryService.pageChildList(parentCode));
    }

}
