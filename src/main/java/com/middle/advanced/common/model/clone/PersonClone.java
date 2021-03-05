package com.middle.advanced.common.model.clone;

import lombok.Data;

import java.util.Date;

/**
 * 基本数据类型 浅克隆与深度克隆没什么差别
 * 对象引用时浅度克隆用的还是原来的内存地址 深度克隆是新的地址
 * cloneText有测试  ==直接判断地址是否相同
 *
 * @author happy
 */
@Data
public class PersonClone implements Cloneable {

    private String name;

    private int age;

    private Date date;

    public void show() {
        System.out.println("原型模式实现类" + name);
    }


    @Override
    public PersonClone clone() {
        PersonClone personClone = null;
        try {
            personClone = (PersonClone) super.clone();
            //没有下面这个 那么就是浅克隆
            personClone.date = null == this.date ? null : (Date) this.date.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return personClone;
    }
}
