package com.sdyin.eurekaclient.controller;


import com.netflix.discovery.converters.Auto;
import com.sdyin.eurekaclient.mq.MqSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mq")
public class MqController {

    @Autowired
    private MqSend mqSend;

    @GetMapping("/test")
    public String test(){

        mqSend.send();

        return "test";
    }
}
