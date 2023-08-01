package Clase25;

public class JuegoHelper {
    public static final int DIFICULTAD_ALTA = 10;
    public static final int DIFICULTAD_MEDIA = 5;
    public static final int DIFICULTAD_BAJA = 1;
    private static int puntuacion1;
    private static int puntuacion2;
    private static int dificultad;
    private static final JuegoHelper instance = new JuegoHelper();
    private JuegoHelper(){
    }
    public static JuegoHelper getInstance(){
        return instance;
    }

    public static int getDificultad() {
        return dificultad;
    }

    public static void setDificultad(int dificultad) {
        JuegoHelper.dificultad = dificultad;
    }

    public static int getPuntuacion1() {
        return puntuacion1;
    }

    public static void setPuntuacion1(int puntuacion1) {
        JuegoHelper.puntuacion1 = puntuacion1;
    }

    public static int getPuntuacion2() {
        return puntuacion2;
    }

    public static void setPuntuacion2(int puntuacion2) {
        JuegoHelper.puntuacion2 = puntuacion2;
    }
    public static void mostrarReglasJuego(){
        System.out.println("Las reglas del juego son ...");
    }
}
