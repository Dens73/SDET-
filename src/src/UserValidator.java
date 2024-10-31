public class UserValidator {

    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            // Проверка логина
            if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
                throw new CheckingLogin("Login должен содержать только латинские буквы, цифры и знак подчеркивания и быть меньше 20 символов.");
            }

            // Проверка пароля
            if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20) {
                throw new CheckingPassword("Password должен содержать только латинские буквы, цифры и знак подчеркивания и быть меньше 20 символов.");
            }

            // Проверка совпадения паролей
            if (!password.equals(confirmPassword)) {
                throw new CheckingPassword("Password и ConfirmPassword должны совпадать.");
            }

            // Если все проверки пройдены
            return true;
        } catch (CheckingLogin | CheckingPassword e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false;
        }
    }
}