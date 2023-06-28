package Clase12;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el capital inicial: ");
        double initialCapital = scanner.nextDouble();
        System.out.print("Ingresa la tasa de interes: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Ingresa el tiempo en años: ");
        double years = scanner.nextDouble();
        double finalCapital = calculateFinalCapital(initialCapital, interestRate, years);
        System.out.println("El capital final es: " + finalCapital);
    }
    public static double calculateFinalCapital(double initialCapital, double interestRate, double years){
        return initialCapital * Math.pow((1 + (interestRate/100)), years);
    }
}
