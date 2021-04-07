package com.middle.advanced.common.model.mediator.test;

import java.util.ArrayList;
import java.util.List;

public class EstateMedium implements Middum {
    private List<Customer> members = new ArrayList<>();

    @Override
    public void register(Customer customer) {
        if (!members.contains(customer)) {
            members.add(customer);
            customer.setMiddum(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        members.forEach(x -> {
            String name = x.getName();
            if (name.equals(from)) {
                x.receive(from, ad);
            }
        });
    }
}
