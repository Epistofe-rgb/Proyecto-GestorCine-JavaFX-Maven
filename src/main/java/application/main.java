package application;

import model.Administrador;

import java.util.Scanner;

public class main {
    static void main() {
        System.out.println("Hello World");
        Administrador a = new Administrador();
        Scanner sc = new Scanner(System.in);
        System.out.println("nombres: ");
        a.setNombres(sc.nextLine());
        System.out.println("apellidos: ");
        a.setApellidos(sc.nextLine());
        System.out.println("username: ");
        a.setUsername(sc.nextLine());
        System.out.println("password: ");
        a.setPassword(sc.nextLine());
        System.out.println(a.getNombres() + " " +a.getApellidos()+ " " +a.getUsername() + " " +a.getPassword());
    }
}

