package com.taotao.manager.controller;

import com.taotao.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testServiceImpl;

    @ResponseBody
    @RequestMapping(value = "querydate")
    public String test(){

        return testServiceImpl.queryDate();
    }
}
