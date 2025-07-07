package com.andersen.lesson_9;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Luna"),
                new Cat("Milo"),
                new Cat("Chloe"),
                new Cat("Leo"),
                new Cat("Bella")
        };

        Bowl bowl = new Bowl(50);

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            cat.printFullness();
        }

        bowl.printFood();
        bowl.addFood(30);
        bowl.printFood();

        Payment payment = new Payment();
        payment.addItem("Apple", 1.5);
        payment.addItem("Milk", 2.3);
        payment.addItem("Bread", 1.8);

        System.out.println("\nShopping list:");
        payment.printItems();
        System.out.println("Total: $" + payment.getTotal());

        Park park = new Park();
        park.addAttraction("Ferris Wheel", "10:00 - 18:00", 3.5);
        park.addAttraction("Roller Coaster", "12:00 - 20:00", 5.0);
        park.addAttraction("Haunted House", "15:00 - 22:00", 4.2);

        System.out.println("\nAttractions in the park:");
        park.printAttractions();
    }
}
