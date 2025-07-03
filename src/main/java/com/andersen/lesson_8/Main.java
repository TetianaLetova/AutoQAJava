package com.andersen.lesson_8;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Smith", "Engineer", "john.smith@mail.com", "1234567890", 50000, 42);
        employees[1] = new Employee("Emily Davis", "Project Manager", "emily.davis@mail.com", "2345678901", 60000, 35);
        employees[2] = new Employee("Michael Brown", "Developer", "michael.brown@mail.com", "3456789012", 70000, 45);
        employees[3] = new Employee("Olivia Wilson", "Designer", "olivia.wilson@mail.com", "4567890123", 55000, 29);
        employees[4] = new Employee("William Johnson", "QA Engineer", "william.johnson@mail.com", "5678901234", 62000, 50);

        System.out.println("Employees older than 40:");
        for (Employee emp : employees) {
            if (emp.getAge() > 40) {
                emp.printInfo();
            }
        }
    }
}
