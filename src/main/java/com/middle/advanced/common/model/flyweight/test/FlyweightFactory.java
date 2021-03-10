package com.middle.advanced.common.model.flyweight.test;

import com.middle.advanced.common.model.flyweight.UnShareEntity;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, TableService> flyweights = new HashMap<>();

    public TableService getService(String key) {
        TableService tableService = flyweights.get(key);
        if (null != tableService) {
            System.out.println(key + "被成功获取！");
            tableService.createTable(new UnShareEntity(key));
        } else {
            tableService = new TableServiceImpl();
            tableService.createTable(new UnShareEntity(key));
            flyweights.put(key, tableService);
        }
        return tableService;
    }
}
