package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    /**
     * 用于展示index中页面跳转
     * @param pagename
     * @return
     */
    @RequestMapping("{pagename}")
    public String showPage(@PathVariable String pagename){
        return pagename;
    }
}
