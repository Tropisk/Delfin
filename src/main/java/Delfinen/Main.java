package Delfinen;

import Delfinen.Login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        boolean isAuthenticated = login.authenticateUser();

        if (isAuthenticated) {
            System.out.println("Welcome!.");
        } else {
            System.out.println("Authentication failed. Exiting program.");
        }

        Menu menu = new Menu();
        menu.run();
    }
}
