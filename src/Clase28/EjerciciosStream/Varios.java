package Clase28.EjerciciosStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Varios {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Nuria");
        nombres.add("Alba");
        nombres.stream().forEach(nombre -> System.out.println(nombre.toUpperCase()));

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.stream().map(numero -> numero * 7)
                        .collect(Collectors.toList())
                        .forEach(numero -> System.out.println(numero));

        numeros.stream().map(numero -> numero * 2)
                        .collect(Collectors.toList())
                        .forEach(numero -> System.out.println(numero));

        nombres.stream().map(nombre -> nombre.length())
                        .collect(Collectors.toList())
                        .forEach(nombre -> System.out.println(nombre));

        numeros.stream().map(num -> num * 9/5 + 32)
                        .collect(Collectors.toList())
                        .forEach(num -> System.out.println(num));

    }



}
