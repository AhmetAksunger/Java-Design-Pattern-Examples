package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        Database database = new Database();

        BaseAuthHandler handlerChain = new UserExistsHandler(database);
        handlerChain.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckerHandler());

        AuthService authService = new AuthService(handlerChain);
        authService.authenticate("ADMIN_user", "admin_password");
        authService.authenticate("USER_john", "user_password");
        authService.authenticate("invalidusername", "user_password");

    }
}
