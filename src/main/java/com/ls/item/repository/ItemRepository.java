package com.ls.item.repository;

import com.ls.item.entry.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface ItemRepository extends ElasticsearchCrudRepository<Item, Long> {

}
