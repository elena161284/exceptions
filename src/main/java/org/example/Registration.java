package org.example;

import java.util.regex.Pattern;

public class Registration {


    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9_]+$");

    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        checkLogin(login);
        checkPassword(password);
        checkConfirmPassword(password, confirmPassword);
    }

    private static boolean isCheckWithRegex(String str) {
        return str.matches("^[a-zA-Z0-9_!]+$");
    }

    private static void checkLogin(String login) {
        if (login.length() >= 20) {
            throw new WrongLoginException("Логин должен быть длиной меньше 20 символов!");
        }else if (!isCheckWithRegex(login)){
            throw new WrongLoginException ("Логин содержит недопустимые символы!");
        }
    }

    private static void checkPassword(String password) {
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен быть длиной меньше 20 символов!");
        }else if(!isCheckWithRegex(password)) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы!");
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны!");
        }
    }
}