package com.middle.advanced.common.model.composite.transparent;

public class Left implements Component {
    private String name;

    public Left(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public Component getComponent(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("子节点" + name + "show一下！");
    }
}
