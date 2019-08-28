package com.middle.advanced.service;

import com.middle.advanced.bean.TSummaryConfig;
import com.middle.advanced.dto.summary.ParentSummaryList;
import com.middle.advanced.dto.summary.SummaryConfig;
import com.middle.advanced.mapper.SummaryConfigMapper;
import org.omg.PortableInterceptor.DISCARDING;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@CacheConfig(cacheNames = {"summaryPage"})
public class SummaryService {

    @Autowired
    private SummaryConfigMapper summaryConfigMapper;

    /**
     * 获取所有父级菜单
     **/
    @Cacheable(key = "targetClass+methodName+#P0")
    public List<ParentSummaryList> pageParentList() {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        List<ParentSummaryList> parentList = summaryConfigMapper.findAllByParentSummaryConfigCodeIsNullAndEnableTrue(sort).parallelStream()
                .map(x -> new ParentSummaryList(x.getSummaryConfigCode(), x.getSummaryConfigName(), x.getPagePath(), x.getPageTitalName()))
                .collect(Collectors.toList());
        return parentList;
    }

    /**
     * 根据父级获取子集
     **/
    public List<ParentSummaryList> pageChildList(String parentSummaryConfigCode) {
        List<ParentSummaryList> childList = summaryConfigMapper.findByParentSummaryConfigCodeAndEnableTrueOrderByIdAsc(parentSummaryConfigCode).parallelStream()
                .map(x -> new ParentSummaryList(x.getSummaryConfigCode(), x.getSummaryConfigName(), x.getPagePath(), x.getPageTitalName()))
                .collect(Collectors.toList());
        return childList;
    }


    public int saveSummaryConfig(SummaryConfig summaryConfig) {
        TSummaryConfig config = new TSummaryConfig();
        BeanUtils.copyProperties(summaryConfig, config);
        config = summaryConfigMapper.saveAndFlush(config);
        return config.getId().intValue();
    }

}
