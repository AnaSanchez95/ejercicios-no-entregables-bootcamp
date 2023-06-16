package Clase9;

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos nombres va a ingresar? ");
        int numberPeople = scanner.nextInt();
        String[] names = new String[numberPeople];

        for ( int i = 0; i < names.length; i++){
            System.out.print("Ingresa el nombre de la persona " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            scanner.nextLine();
        }

        System.out.print("Ingresa el nombre a buscar: ");
        String searchName = scanner.nextLine();
        System.out.println(searchName(names, searchName));
    }

    public static String searchName(String[] names, String name){
        String message = "";
        for ( int i = 0; i < names.length; i++){
            String actualName = names[i];
            if (name.toLowerCase().contains(actualName.toLowerCase())){
                message = "El nombre " + name + " esta dentro del listado.";
            }
        }
        if (message == ""){
            message = "El nombre " + name + " no esta dentro del listado.";
        }
        return message;
    }
}
