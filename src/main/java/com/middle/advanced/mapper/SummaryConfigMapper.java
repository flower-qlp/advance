package com.middle.advanced.mapper;

import com.middle.advanced.bean.TSummaryConfig;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SummaryConfigMapper extends JpaRepository<TSummaryConfig, Long> {


    List<TSummaryConfig> findAllByParentSummaryConfigCodeIsNullAndEnableTrue(Sort sort);

    List<TSummaryConfig> findByParentSummaryConfigCodeAndEnableTrueOrderByIdAsc(String parentSummaryConfigCode);
}
