package com.example.demo.controller;


import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("test")
    public void test(){
        testService.openTaobaoChrome();

    }
    @RequestMapping("some")
    public String some(){
        return  "520";
    }
}
