package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Registration.check("Dcddddddffgbilhjol!",
                    "hhhhhhhhh__________", "hhhhhhhhh__________");
            System.out.println("Логин завершен!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
