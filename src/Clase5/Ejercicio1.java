package Clase5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el país que desea buscar: ");
        String country = scanner.nextLine();
        System.out.println("Ingrese en el siguiente link: https://www.google.com/maps/search/" + country);
    }
}
