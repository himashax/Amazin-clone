package com.grocerybud.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> listProducts() {
        return (List<Item>) itemRepository.findAll();
    }
}
