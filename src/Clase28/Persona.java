package Clase28;

public class Persona {
    private String nombre;
    private int edad;
    private double salario;

     public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Persona setSalario(double salario) {
        this.salario = salario;
        return this;
    }
}
