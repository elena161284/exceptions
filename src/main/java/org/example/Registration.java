package org.example;

public class Registration {

    private static final String ALLOWED_CHARS="adchbj";

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() < 10) {
            throw new WrongLoginException("Логин должен иметь не меньше 10 символов!");
        }
        if (!checkSymbol(login)) {
            throw new WrongLoginException("Логин содержит недопустимые символы!");
        }
        if (password.length() < 5) {
            throw new WrongPasswordException("Пароль должен иметь не меньше 5 символов!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны!");
        }
        if (!checkSymbol(password)) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы!");
        }
    }
    private static boolean checkSymbol(String symbol) {
        var lowercase = symbol.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            var c = lowercase.charAt(i);
            if (!ALLOWED_CHARS.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}