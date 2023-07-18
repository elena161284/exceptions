package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Registration.check("Adcddddddffgbilhjoljbnlkkoj",
                    "5hhhhhhhhh__________", "6hhhhhhhhh__________");
            System.out.println("Логин завершен!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
