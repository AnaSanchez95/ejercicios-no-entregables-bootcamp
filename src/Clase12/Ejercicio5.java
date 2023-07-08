package Clase12;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Elefante";
        String clue = "Es un animal muy grande, con trompa";
        String playerAnswer;


do {
    System.out.print( clue + "\nIngresa tu respuesta: ");
    playerAnswer = scanner.nextLine();
    if (playerAnswer.equalsIgnoreCase(correctAnswer)) {
        System.out.println("Acertaste!");
        break;
    }
    else
        System.out.println("Prueba otra vez");
} while (true);

    }
}
