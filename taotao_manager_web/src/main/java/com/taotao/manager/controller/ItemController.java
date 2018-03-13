package com.taotao.manager.controller;

import com.taotao.base.ItemDescService;
import com.taotao.base.ItemService;
import com.taotao.manager.pojo.Item;
import com.taotao.manager.pojo.ItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 保存添加商品
     * @param item 绑定item对象参数
     * @param desc 描述参数
     * @return
     */

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String saveItem(Item item, String desc){
        try {
            itemService.saveItemAndDesc(item,desc);
            return "0";
        } catch (Exception e) {
            e.printStackTrace();
            //保存失败
            return "1";
        }

    }

}
