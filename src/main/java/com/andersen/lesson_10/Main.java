package com.andersen.lesson_10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(appleBox1.compare(appleBox2));

        appleBox1.transferTo(appleBox2);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());

        String[] names = {"Apple", "Orange", "Pear"};
        Box.swap(names, 0, 2);
        System.out.println(names[0] + " " + names[1] + " " + names[2]);
    }
}
