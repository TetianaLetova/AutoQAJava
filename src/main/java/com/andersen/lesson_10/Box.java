package com.andersen.lesson_10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        if (fruits.getFirst() instanceof Apple) {
            return fruits.size() * 1.0f;
        }
        return fruits.size() * 1.5f;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001f;
    }

    public void transferTo(Box<T> otherBox) {
        if (this == otherBox) return;
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}