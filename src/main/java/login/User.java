package login;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";

        System.out.println("----- LOGIN -----");

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto)
                && password.equals(passwordCorrecto)) {

            System.out.println("Login correcto");
            System.out.println("Bienvenido " + usuario);

        } else {

            System.out.println("Usuario o contraseña incorrectos");
        }

        scanner.close();
    }
}
