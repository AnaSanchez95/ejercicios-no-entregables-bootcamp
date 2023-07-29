package Clase23.Ejercicio2;

public class Pianista implements IMusico{
    public Pianista() {
    }

    @Override
    public String tocarInstrumento() {
        return "Esta tocando el piano";
    }
}
