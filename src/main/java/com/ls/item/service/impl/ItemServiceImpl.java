package com.ls.item.service.impl;

import com.ls.item.entry.Item;
import com.ls.item.repository.ItemRepository;
import com.ls.item.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItem() {
        Iterable<Item> all = itemRepository.findAll();
        Iterator<Item> iterator = all.iterator();
        List<Item> list = new ArrayList<>();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }
}
