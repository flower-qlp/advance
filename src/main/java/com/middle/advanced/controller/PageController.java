package com.middle.advanced.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "/rsbu/index";
    }

    @RequestMapping(value = "/backstage/page/rsbu/index", method = RequestMethod.GET)
    public String index() {
        return "/rsbu/index";
    }

    @RequestMapping(value = "/backstage/page/rsbu/table", method = RequestMethod.GET)
    public String table() {
        return "/rsbu/table";
    }

    @RequestMapping(value = "/backstage/page/rsbu/form", method = RequestMethod.GET)
    public String form() {
        return "/rsbu/form";
    }

}
