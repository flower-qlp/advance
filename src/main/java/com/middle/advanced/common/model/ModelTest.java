package com.middle.advanced.common.model;


import com.alibaba.fastjson.JSON;
import com.middle.advanced.common.model.adapter.classadapter.Mobile;
import com.middle.advanced.common.model.adapter.classadapter.Volteage220;
import com.middle.advanced.common.model.adapter.classadapter.VolteageAdapter;
import com.middle.advanced.common.model.adapter.objectadapter.VolteageAdapter2;
import com.middle.advanced.common.model.decorate.Bread;
import com.middle.advanced.common.model.decorate.Cream;
import com.middle.advanced.common.model.decorate.Food;
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
//        Person xiaoWang = new XiaoWang();
//        Person xiaoLi = new XiaoLi();
//        XiaoMei xiaoMei = new XiaoMei();
//        xiaoMei.addPerson(xiaoWang);
//        xiaoMei.addPerson(xiaoLi);
//        xiaoMei.notifyPerson();

        //装饰者
        //一个涂了奶油的面包 通过组装得到想要的类
//        Food food = new Bread(new Cream(new Food("奶油蛋糕=")));
//        System.out.println(food.make());
        //类适配器
//        Mobile mobile = new Mobile();
//        mobile.charging(new VolteageAdapter());

        Mobile mobile = new Mobile();
        mobile.charging(new VolteageAdapter2(new Volteage220()));
    }
}
