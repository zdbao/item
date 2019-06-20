package com.ls.item.service;

import com.ls.item.entry.Item;

import java.util.List;

public interface ItemService {

    Item save(Item item);

    List<Item> getAllItem();
}
