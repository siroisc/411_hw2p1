package com.example.astroswin.Model;

public class Student {
    private String itemName;
    private String itemDescription;

    public Student(String name, String description) {
        this.itemName = name;
        this.itemDescription = description;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String description) {
        this.itemDescription = description;
    }

}
