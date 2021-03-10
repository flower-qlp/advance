package com.middle.advanced.common.model.flyweight.test;

import com.middle.advanced.common.model.flyweight.UnShareEntity;

public class TableServiceImpl implements TableService {

    public TableServiceImpl() {
        System.out.println("类创建");
    }

    @Override
    public void createTable(UnShareEntity unShareEntity) {
        System.out.println(unShareEntity.getInfo() + "桌子创建！");
    }
}
