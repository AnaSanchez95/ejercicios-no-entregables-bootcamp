package Clase5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        Double number1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        Double number2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        Double number3 = scanner.nextDouble();
        Double average = (number1 + number2 + number3) / 3.0;
        System.out.println("El promedio es: " + average);
    }
}
