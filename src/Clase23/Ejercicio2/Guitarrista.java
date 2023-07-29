package Clase23.Ejercicio2;

public class Guitarrista implements IMusico{
    public Guitarrista() {
    }

    @Override
    public String tocarInstrumento() {
        return "Esta tocando la guitarra";
    }
}
