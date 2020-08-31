package com.middle.advanced.common.model;


import com.alibaba.fastjson.JSON;
import com.middle.advanced.common.model.adapter.classadapter.Mobile;
import com.middle.advanced.common.model.adapter.classadapter.Volteage220;
import com.middle.advanced.common.model.adapter.classadapter.VolteageAdapter;
import com.middle.advanced.common.model.adapter.objectadapter.VolteageAdapter2;
import com.middle.advanced.common.model.clone.PersonClone;
import com.middle.advanced.common.model.decorate.Bread;
import com.middle.advanced.common.model.decorate.Cream;
import com.middle.advanced.common.model.decorate.Food;
import com.middle.advanced.common.model.factory.simpleFactory.Car;
import com.middle.advanced.common.model.factory.simpleFactory.SimpleFactory;
import com.middle.advanced.common.model.generator.Computer;
import com.middle.advanced.common.model.generator.ComputerBuilder;
import com.middle.advanced.common.model.generator.Director;
import com.middle.advanced.common.model.generator.HPComputerBuilder;
import com.middle.advanced.common.model.observer.Person;
import com.middle.advanced.common.model.observer.XiaoLi;
import com.middle.advanced.common.model.observer.XiaoMei;
import com.middle.advanced.common.model.observer.XiaoWang;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.BeanUtils;

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

//        Mobile mobile = new Mobile();
//        mobile.charging(new VolteageAdapter2(new Volteage220()));

        //工厂类
//        Car c = SimpleFactory.getCarInstance("Benz");
//        if (c != null) {
//            c.run();
//            c.stop();
//        } else {
//            System.out.println("造不了这种汽车。。。");
//        }

        //生成器
//        Director director = new Director();
//        director.setComputerBuilder(new HPComputerBuilder());
//        director.constructComputer();
//        Computer computer = director.getComputer();
//        System.out.println(JSON.toJSONString(computer));

        //原型模式
        PersonClone p = new PersonClone();
        p.setName("good");
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            PersonClone cloneP = (PersonClone) p.clone();
//          PersonClone cloneP = new PersonClone();
//          BeanUtils.copyProperties(p, cloneP);
            cloneP.setName(cloneP.getName() + i);
            cloneP.show();
        }
        System.out.println(System.currentTimeMillis());
    }


}
