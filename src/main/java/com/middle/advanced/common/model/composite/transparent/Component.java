package com.middle.advanced.common.model.composite.transparent;

public interface Component {
    void add(Component c);

    void remove(int i);

    Component getComponent(int i);

    void operation();
}
