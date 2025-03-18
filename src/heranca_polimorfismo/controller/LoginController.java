package heranca_polimorfismo.controller;

import heranca_polimorfismo.model.Login;
import heranca_polimorfismo.view.LoginView;

public class LoginController {
    private Login login;
    private LoginView loginView;

    public LoginController(Login login, LoginView loginView) {
        this.login = login;
        this.loginView = loginView;
    }

    public void performLogin(String email, String senha) {
        try {
            login.logar(email, senha);
            loginView.displayLoginInfo(login);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLoginId() {
        return login.getId();
    }
}
