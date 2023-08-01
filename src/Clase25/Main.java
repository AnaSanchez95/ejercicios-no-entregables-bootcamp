package Clase25;

public class Main {
    public static void main(String[] args) {
        JuegoHelper.mostrarReglasJuego();
        int dificultad = JuegoHelper.DIFICULTAD_ALTA;

        if (JuegoHelper.getInstance().getDificultad() == JuegoHelper.DIFICULTAD_BAJA){
            JuegoHelper.setPuntuacion1(100);
        } else {
            JuegoHelper.getPuntuacion1();
        }


    }
}
