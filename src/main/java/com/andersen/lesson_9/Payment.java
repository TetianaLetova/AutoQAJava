package com.andersen.lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.name + ": $" + item.price);
        }
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }

    private class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}
