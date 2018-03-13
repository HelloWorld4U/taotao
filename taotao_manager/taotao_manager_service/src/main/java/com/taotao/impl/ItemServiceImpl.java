package com.taotao.impl;

import com.taotao.BaseServiceImpl;
import com.taotao.base.ItemDescService;
import com.taotao.base.ItemService;
import com.taotao.manager.pojo.Item;
import com.taotao.manager.pojo.ItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Autowired
    private ItemDescService itemDescService;
    @Override
    public void saveItemAndDesc(Item item, String desc) {

        //保存商品内容
        item.setStatus(1);
        saveSelective(item);

        //保存商品描述
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemId(item.getId());
        itemDesc.setItemDesc(desc);

        itemDescService.saveSelective(itemDesc);
    }
}
