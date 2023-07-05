package Clase12.Ejercicio4;

public class main {
/*
    Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos: El programa
     permitir al usuario cargar las notas de varios alumnos. Cada alumno debe tener atributos como nombre, apellido
      y una lista de notas. Utilizando la programación orientada a objetos, el programa debe permitir ingresar las
       notas de cada alumno y realizar cálculos como el promedio de notas.
*/
public static void main(String[] args) {
    Student ana = new Student("Ana", "Sánchez", new Double[]{5.5, 5.6, 7.6, 5.0, 5.4, 4.5, 6.5});
    System.out.println(ana.gradesAverage());
}
}
