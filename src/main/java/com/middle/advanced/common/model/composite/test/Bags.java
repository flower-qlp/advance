package com.middle.advanced.common.model.composite.test;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Data
public class Bags implements Composite {
    private String name;
    private List<Composite> goodsList = new ArrayList<>();

    public Bags() {
    }

    public Bags(String name) {
        this.name = name;
    }

    public void add(Composite goods) {
        goodsList.add(goods);
    }

    public void remove(int i) {
        if (i < 0) {
            return;
        }
        if (i >= goodsList.size()) {
            return;
        }
        goodsList.remove(i);
    }

    public Composite getChild(int i) {
        if (i < 0) {
            return null;
        }
        if (i >= goodsList.size()) {
            return null;
        }
        return goodsList.get(i);
    }

    @Override
    public float calculation() {
        AtomicReference<Float> totalPrice =
                new AtomicReference<>(0f);
        goodsList.forEach(x -> {
            totalPrice.set(x.calculation() + totalPrice.get());
        });
        return totalPrice.get();
    }

    @Override
    public void show() {
        System.out.println("产品信息展示:");
        goodsList.forEach(x -> {
            System.out.println(x.calculation());
        });
        System.out.println("总金额");
        System.out.println(this.calculation());
    }
}
