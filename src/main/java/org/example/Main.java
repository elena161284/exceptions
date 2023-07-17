package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Registration.check("adcddddddw", "hhhhh", "hhhhh");
            System.out.println("Логин завершен!");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
    }
}