package com.taotao.manager.controller;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.base.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping(value = "/{pageNum}")
    public List<ItemCat> findByPage(@PathVariable(value = "pageNum") Integer pageNum,Integer pageSize){

        List<ItemCat> list = itemCatService.queryByPage(pageNum,pageSize);

        return list;
    }

    /**
     * 返回菜单树数据格式，默认查询所有根节点(parentId=0)
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<ItemCat> queryItemCatByParentId(@RequestParam(defaultValue = "0") Long id){

        ItemCat itemCat = new ItemCat();
        itemCat.setParentId(id);

        List<ItemCat> list = itemCatService.queryListByWhere(itemCat);

        return list;
    }


}
