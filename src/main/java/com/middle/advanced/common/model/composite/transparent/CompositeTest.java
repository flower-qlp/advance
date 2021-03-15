package com.middle.advanced.common.model.composite.transparent;

public class CompositeTest {
    public static void main(String[] args) {
        Component parent = new Composite();

        Component child = new Composite();

        Component left1 = new Left("parent-left1");
        Component left2 = new Left("child-left1");
        Component left3 = new Left("child-left2");

        parent.add(child);
        parent.add(left1);

        child.add(left2);
        child.add(left3);

        parent.operation();


    }
}
