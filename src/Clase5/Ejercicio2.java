package Clase5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el usuario que esta buscando: ");
        String username = scanner.nextLine();
        System.out.println("El link a twitter de " + username + " es : https://twitter.com/search?q=" + username);
    }
}
