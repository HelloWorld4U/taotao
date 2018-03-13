package com.taotao.base;

import com.taotao.manager.pojo.Item;

public interface ItemService extends BaseService<Item> {

    void saveItemAndDesc(Item item, String desc);
}
