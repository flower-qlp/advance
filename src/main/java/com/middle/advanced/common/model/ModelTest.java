package com.middle.advanced.common.model;


import com.middle.advanced.common.model.observer.Person;
import com.middle.advanced.common.model.observer.XiaoLi;
import com.middle.advanced.common.model.observer.XiaoMei;
import com.middle.advanced.common.model.observer.XiaoWang;

/**
 * 模式测试
 *
 * @author happy
 */
public class ModelTest {

    public static void main(String[] args) {
        //观察者模式小例子
        Person xiaoWang = new XiaoWang();
        Person xiaoLi = new XiaoLi();
        XiaoMei xiaoMei = new XiaoMei();
        xiaoMei.addPerson(xiaoWang);
        xiaoMei.addPerson(xiaoLi);
        xiaoMei.notifyPerson();

    }
}
