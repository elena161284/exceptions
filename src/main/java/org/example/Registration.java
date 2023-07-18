package org.example;

public class Registration {

    private static final String ALLOWED_CHARS="abcdefghijklmnopqrstuvwxyz0123456789_";

    public static void check(String login, String password, String confirmPassword)
                             throws WrongLoginException, WrongPasswordException {
        if (!isValidLogin(login)) {
            throw new WrongLoginException("Логин должен содержать не меньше 20 символов!");
        }
        if (!isValidChars(login)||!isValidChars(password)) {
            throw new RuntimeException("Строка содержит недопустимые символы!");
        }
        if (!isValidPassword(password)) {
            throw new WrongPasswordException("Пароль должен содержать не меньше 20 символов!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны!");
        }
    }
    private static boolean isValidChars(String symbol) {
        var lowercase = symbol.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            var c = lowercase.charAt(i);
            if (!ALLOWED_CHARS.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
    private static boolean isValidLogin(String login) {
        return login.length() >= 20;

    }
    private static boolean isValidPassword(String password) {
        return password.length() >= 20;
    }

    @Override
    public boolean equals(Object password) {
        return super.equals(password);
    }
}