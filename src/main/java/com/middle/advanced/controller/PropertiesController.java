package com.middle.advanced.controller;

import com.middle.advanced.utils.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PropertiesController {

    @Autowired
    private PropertyUtil propertyUtil;

    @GetMapping(value = "/properties/name")
    public Map<String, Object> testName() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("name", propertyUtil.myName);
        map.put("myName", propertyUtil.myName);
        return map;
    }

}
