package com.grocerybud.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @RequestMapping("/msg")
    public String displayMessage() {
        return "Hello there";
    }

    @RequestMapping("/items")
    public List<Item> getItems() {
        return service.listProducts();
    }


}
