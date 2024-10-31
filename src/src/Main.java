public class Main {
    public static void main(String[] args) {
        System.out.println(UserValidator.validateCredentials("valid_login", "validPassword1", "validPassword1")); // Ожидаем true
        System.out.println(UserValidator.validateCredentials("invalid_login_too_long_name", "validPassword1", "validPassword1")); // Ожидаем false
        System.out.println(UserValidator.validateCredentials("valid_login", "invalid_password_with_specials!", "invalid_password_with_specials!")); // Ожидаем false
        System.out.println(UserValidator.validateCredentials("valid_login", "validPassword1", "differentPassword")); // Ожидаем false
    }
}