package com.middle.advanced.common.model.composite.transparent;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> components = null;

    @Override
    public void add(Component c) {
        if (null == components) {
            components = new ArrayList<>();
        }
        components.add(c);
    }

    @Override
    public void remove(int i) {
        if (i >= components.size()
                || i < 0) {
            return;
        }
        components.remove(i);
    }

    @Override
    public Component getComponent(int i) {
        if (i >= components.size()
                || i < 0) {
            return null;
        }
        return components.get(i);
    }

    @Override
    public void operation() {
        for (Component c : components) {
            c.operation();
        }
    }
}
