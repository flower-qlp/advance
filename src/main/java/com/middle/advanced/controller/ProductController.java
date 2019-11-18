package com.middle.advanced.controller;

import com.middle.advanced.bean.Product;
import com.middle.advanced.common.agent.Agent;
import com.middle.advanced.common.agent.AgentHandler;
import com.middle.advanced.service.ProductService;
import com.middle.advanced.service.ProductServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Optional;

@RestController
@Api(value = "/",tags = "Product")
public class ProductController {

    @Autowired
    private ProductService productService;


    private Agent agent = new Agent();

    @GetMapping("/product/{name}")
    public String product(@PathVariable("name") Optional<String> name) {

        return agent.getProductDetail(name.get());
        //return productService.getProductDetail(name.get());
    }


    @GetMapping("/product/list/{type}")
    public List<Product> productList(@PathVariable("type") Optional<String> type) {

        ProductService productService= (ProductService)Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[]{ProductService.class},
                new AgentHandler(new ProductServiceImpl()));
        List<Product> list=productService.getProductListByType("测试");
        return productService.getProductListByType(type.get());
    }


}
