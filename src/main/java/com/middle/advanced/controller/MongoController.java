package com.middle.advanced.controller;

import com.middle.advanced.bean.Product;
import com.middle.advanced.demo.mongo.MongoDbJdbc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
@Api(tags = "mongo", value = "")
public class MongoController {

    @Autowired
    private MongoDbJdbc mongoDbJdbc;

    @GetMapping(value = "/mongo/test/save")
    @ApiOperation(value = "测试mongo的联通")
    public void save() {
        Product p = new Product();
        p.setId(12123L);
        p.setName("宅宅会");
        mongoDbJdbc.save(p);
    }

    @GetMapping(value = "/mongo/test/findOne")
    @ApiOperation(value = "测试mongo的联通")
    public Product findOne() {
        return mongoDbJdbc.findOne(Product.class, "product");
    }

    @GetMapping(value = "/mongo/test/delete")
    @ApiOperation(value = "测试mongo的联通")
    public void delete() {
        mongoDbJdbc.delete();
    }

}
