package com.middle.advanced.common.model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author happy
 */
public class XiaoMei {

    List<Person> list = new ArrayList<>();

    public XiaoMei() {
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public void notifyPerson() {
        for (Person person : list) {
            person.getMessage("收到小消息回复");
        }
    }

}
