package com.grocerybud.backend;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Item {
    @Id
    @Column(name = "id", nullable = false, length = 25)
    private String id;

    @Column(name = "name",  length = 250)
    private String name;

    public Item() {
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
