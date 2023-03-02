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
    public String saveItem(Item item) {
        itemRepository.save(item);
        return "success";
    }

    public String updateItem(String id, Item item) {
        if (itemRepository.existsById(id)) {
            itemRepository.save(item);
            return "success";
        }
        return null;
    }

    public String deleteItem(String id) {
        itemRepository.deleteById(id);
        return "danger";
    }


}
