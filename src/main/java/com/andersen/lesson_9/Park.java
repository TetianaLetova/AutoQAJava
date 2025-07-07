package com.andersen.lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions = new ArrayList<>();

    public void addAttraction(String name, String hours, double price) {
        attractions.add(new Attraction(name, hours, price));
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction.name + " | Open: " + attraction.hours + " | Price: $" + attraction.price);
        }
    }

    private class Attraction {
        private String name;
        private String hours;
        private double price;

        public Attraction(String name, String hours, double price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }
    }
}
