package Clase5;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piedra, Papel o Tijera");
        System.out.print("Ingresa tu elección: ");
        String playerChoice = scanner.nextLine();
        Integer computerChoice = (int)Math.round(Math.random() * 2.0 + 1.0);
        if ((!playerChoice.equals("Piedra") || computerChoice != 3) && (!playerChoice.equals("Papel") || computerChoice != 2) && (!playerChoice.equals("Tijera") || computerChoice != 1)) {
            if ((!playerChoice.equals("Piedra") || computerChoice != 1) && (!playerChoice.equals("Papel") || computerChoice != 3) && (!playerChoice.equals("Tijera") || computerChoice != 2)) {
                System.out.println(computerChoice);
                System.out.println("¡Has perdido!");
            } else {
                System.out.println(computerChoice);
                System.out.println("¡Has ganado!");
            }
        } else {
            System.out.println(computerChoice);
            System.out.println("¡Empatasteis!");
        }

    }
}
