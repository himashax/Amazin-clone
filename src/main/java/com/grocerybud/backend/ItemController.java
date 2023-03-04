package com.grocerybud.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://grocery-bud-60d83.web.app/")
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @RequestMapping("/msg")
    public String displayMessage() {
        return "Hello there";
    }

    @GetMapping("/")
    public List<Item> groceryList() {
        return service.listProducts();
    }

    @PostMapping("/add")
    public String addGroceryItems(@RequestBody Item item) {
        return service.saveItem(item);
    }

    @PutMapping("/{id}")
    public String editGroceryItems(@PathVariable String id, @RequestBody Item item) {
        return service.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public String removeGroceryItems(@PathVariable String id) {
        return service.deleteItem(id);
    }

    @DeleteMapping("/delete")
    public String removeAllGroceryItems() {
        return service.deleteAllItems();
    }



}
