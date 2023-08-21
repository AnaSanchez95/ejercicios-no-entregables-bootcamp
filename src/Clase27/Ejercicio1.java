package Clase27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cadena de texto: ");
        String cadena = scanner.nextLine();
        ;
        System.out.println(contarPalabras(cadena));
    }

    public static Map<String, Integer> contarPalabras(String cadena){
        Map<String, Integer> palabras = new HashMap<>();
        cadena = cadena.toLowerCase();
        String[] arrayCadena = cadena.split(" ");

        int totalPalabras = arrayCadena.length;

        for(int i = 0; i < totalPalabras; i++) {
            if (!palabras.containsKey(arrayCadena[i])){
                palabras.put(arrayCadena[i], 1);
            }
            else {
                palabras.put(arrayCadena[i], palabras.get(arrayCadena[i]) + 1);
            }
        }
        return palabras;
    }
}
