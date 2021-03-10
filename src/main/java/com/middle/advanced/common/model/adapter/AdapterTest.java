package com.middle.advanced.common.model.adapter;

import com.middle.advanced.common.model.adapter.test.ABCService;
import com.middle.advanced.common.model.adapter.test.ABCServiceImpl;

public class AdapterTest {
    public static void main(String[] args) {
        ABCService abcService=new ABCServiceImpl();
        abcService.create();
    }
}
