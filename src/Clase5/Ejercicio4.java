package Clase5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
        System.out.print("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n 2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora \n¿Que camino eliges? (1/2): ");
        Integer chosen = scanner.nextInt();
        if (chosen == 1) {
            System.out.println("Has elegido el camino 1.\n Una araña gigante aparece de la nada y te mata.");
        } else if (chosen == 2) {
            System.out.print("Has elegido el camino 2.\nDecides seguir el sendero iluminado hacia la pequeña cabaña acogedora.\nAl llegar a la cabaña, te das cuenta de que hay dos puertas:\n1) Entras por la puerta de la izquierda\n2) Optas por la puerta de la derecha\n¿Que camino eliges? (1/2): ");
            chosen = scanner.nextInt();
            if (chosen == 1) {
                System.out.println("Has elegido el camino 1.\nAl abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
            } else if (chosen == 2) {
                System.out.println("Has elegido el camino 2. \nUna araña gigante aparece de la nada y te mata.");
            } else {
                System.out.println("La opción ingresada no es correcta, prueba otra vez.");
            }
        } else {
            System.out.println("La opción ingresada no es correcta, prueba otra vez.");
        }
    }
}
