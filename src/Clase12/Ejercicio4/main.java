package Clase12.Ejercicio4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
/*
    Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos: El programa
     permitir al usuario cargar las notas de varios alumnos. Cada alumno debe tener atributos como nombre, apellido
      y una lista de notas. Utilizando la programación orientada a objetos, el programa debe permitir ingresar las
       notas de cada alumno y realizar cálculos como el promedio de notas.
*/
public static void main(String[] args) {
    int opcion;
    List<Student> listaAlumnos = new ArrayList<>();

    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:" +
                                    "\n 1- Crear Nuevo alumno" +
                                    "\n 2- Ver notas" +
                                    "\n 0- Salir"));
        switch (opcion){
            case 0: break;
            case 1:
                crearAlumno(listaAlumnos);
                break;
            case 2:
                verMediaAlumnos(listaAlumnos);
                break;
            default: JOptionPane.showMessageDialog(null, "La opción ingresada no es correcta");
        }
    }while (opcion != 0);

}

    private static void verMediaAlumnos(List<Student> listaAlumnos) {
        listaAlumnos.stream().forEach(alumno -> JOptionPane.showMessageDialog(null, "La media de " + alumno.getName() +
                                                                                                            alumno.getLastName() + " " +
                                                                                                            " es: " + alumno.gradesAverage()));
    }

    private static void crearAlumno(List<Student> listaAlumnos) {
        double[] notas = new double[7];
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno:");
        String apellido = JOptionPane.showInputDialog("Ingresa el apellido del alumno:");
        for (int i = 0; i < 7; i++){
           notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota " + (i + 1)  + " del alumno:"));
        }
        listaAlumnos.add(new Student(nombre, apellido, notas));
    }
}
