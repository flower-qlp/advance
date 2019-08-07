package com.middle.advanced.service;

import com.middle.advanced.bean.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String getProductDetail(String name) {

        System.out.println(name + " eats xiang ");
        return "hello  i am " + name + "1";
    }

    @Override
    public List<Product> getProductListByType(String type) {
        List<Product> products = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            products.add(new Product(Long.valueOf(i), "小商品" + 1));
        }
        return products;
    }
}
