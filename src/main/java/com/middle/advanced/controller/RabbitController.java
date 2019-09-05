package com.middle.advanced.controller;

import com.middle.advanced.common.rabbit.OneToOneSender;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/", tags = "Rabiit")
public class RabbitController {

    @Autowired
    private OneToOneSender oneToOneSender;


    @PostMapping(value = "/sendMessageOneToOne")
    public void sendOneToOne(@RequestParam(value = "text") String text) {
        oneToOneSender.send(text);
    }

}
