package com.andersen.lesson_9;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean fullness;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
        this.fullness = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            fullness = true;
        }
    }

    public void printFullness() {
        if (fullness) {
            System.out.println(name + " is full.");
        } else {
            System.out.println(name + " is still hungry.");
        }
    }
}
