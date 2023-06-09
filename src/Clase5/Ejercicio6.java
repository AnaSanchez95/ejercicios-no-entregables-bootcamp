package Clase5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        Double number1 = scanner.nextDouble();
        System.out.print("Ingrese el número 2: ");
        Double number2 = scanner.nextDouble();
        System.out.print("Ingrese el número 3: ");
        Double number3 = scanner.nextDouble();
        Double higher;
        if (number1 > number2 && number1 > number3) {
            higher = number1;
        } else if (number2 > number1 && number2 > number3) {
            higher = number2;
        } else {
            higher = number3;
        }

        Double lower;
        if (number1 < number2 && number1 < number3) {
            lower = number1;
        } else if (number2 < number1 && number2 < number3) {
            lower = number2;
        } else {
            lower = number3;
        }

        System.out.println("El mayor es " + higher + " y el menor es " + lower);
    }
}
