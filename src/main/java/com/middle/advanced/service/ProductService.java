package com.middle.advanced.service;

import com.middle.advanced.bean.Product;

import java.util.List;

public interface ProductService {

    String getProductDetail(String name);

    List<Product> getProductListByType(String type);
}
