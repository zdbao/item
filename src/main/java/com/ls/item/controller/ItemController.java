package com.ls.item.controller;

import com.ls.item.entry.Item;
import com.ls.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/saveItem")
    public Object save(){
        Item item = new Item();
        item.setId(1l);
        item.setBookId(1l);
        item.setItemTypeId(1l);
        item.setUserId(1l);
        item.setAmount(10.21f);
        Item save = itemService.save(item);
        return save;
    }

    @RequestMapping("/getItemAll")
    @ResponseBody
    public Object getItemAll(){
        List<Item> allItem = itemService.getAllItem();
        return allItem;
    }

}
