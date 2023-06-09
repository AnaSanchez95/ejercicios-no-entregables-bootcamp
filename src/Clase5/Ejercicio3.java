package Clase5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número al que desea hacer una llamada: ");
        Integer phoneNumber = scanner.nextInt();
        System.out.println("Para llamar al número " + phoneNumber + " ingrese aqui: https://api.whatsapp.com/send?phone=" + phoneNumber);
    }
}
