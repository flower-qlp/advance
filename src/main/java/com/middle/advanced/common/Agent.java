package com.middle.advanced.common;


import com.middle.advanced.bean.Product;
import com.middle.advanced.service.ProductService;
import com.middle.advanced.service.ProductServiceImpl;

import java.util.List;

/**
 * 静态代理  既实现了接口  又实现了 打印的事
 **/
public class Agent implements ProductService {

    private ProductService productService = new ProductServiceImpl();

    @Override
    public String getProductDetail(String name) {
        System.out.println("-------------agent---------");
        return productService.getProductDetail("jing.wang");
    }

    @Override
    public List<Product> getProductListByType(String type) {
        return productService.getProductListByType(type);
    }
}
