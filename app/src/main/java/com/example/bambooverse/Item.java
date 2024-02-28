package com.example.bambooverse;

public class Item {
    private String itemName;
    private int imageResource;

    public Item(String itemName, int imageResource) {
        this.itemName = itemName;
        this.imageResource = imageResource;
    }

    public String getItemName() {
        return itemName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}