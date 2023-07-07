package Clase13.Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                int opcionMenuPrincipal;
        ArrayList<Figura> figuras = new ArrayList<>();

        do {
            opcionMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("\tMenu Principal" +
                    "\n 1- Crear una nueva figura" +
                    "\n 2- Mostrar datos de las figuras" +
                    "\n 3- Mostrar la sumatoria de las areas" +
                    "\n 4- Mostrar la sumatoria de los perímetros" +
                    "\n 0- Salir"));
            switch (opcionMenuPrincipal){
                case 0: break;
                case 1: mostrarMenuFiguras(figuras); break;
                case 2:
                    MostrarDatosFiguras(figuras);
                    break;
                case 3:
                    calcularSumatorioAreas(figuras);
                    break;
                case 4:
                    calcularSumatorioPerimetros(figuras);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción seleccionada no es correcta, intente otra vez");
            }
        } while (opcionMenuPrincipal != 0);
    }

    private static void MostrarDatosFiguras(ArrayList<Figura> figuras) {
        figuras.stream().forEach(figura -> JOptionPane.showMessageDialog(null, figura.getTipoFigura() + ":" +
                                                                                                              "\n Área: " + figura.calcularArea() +
                                                                                                              "\n Perípetro: " + figura.calcularPerimetro()));
    }

    private static void calcularSumatorioAreas(ArrayList<Figura> figuras) {
        double sumatorioArea = figuras.stream().mapToDouble(Figura::calcularArea).reduce(0, (acum, figura) -> acum +figura);
        JOptionPane.showMessageDialog(null, "El sumatorio de las áreas de las figuras es: " + sumatorioArea);
    }
    private static void calcularSumatorioPerimetros(ArrayList<Figura> figuras){
        double sumatorioPerimetro = figuras.stream().mapToDouble(Figura::calcularPerimetro).reduce(0, (acum, figura) -> acum +figura);
        JOptionPane.showMessageDialog(null, "El sumatorio de los perímetros de las figuras es: " + sumatorioPerimetro);
    }

    private static void mostrarMenuFiguras(ArrayList<Figura> figuras) {
        int elegirFigura;
        do {
            elegirFigura = Integer.parseInt(JOptionPane.showInputDialog("\tMenu Figuras" +
                    "\n 1- Crear Triángulo" +
                    "\n 2- Crear Rectángulo" +
                    "\n 3- Crear Círculo" +
                    "\n 0- Salir"));

            switch (elegirFigura){
                case 0: break;
                case 1:
                    crearTriangulo(figuras);
                    break;
                case 2:
                    crearRectangulo(figuras);
                    break;
                case 3:
                    crearCirculo(figuras);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción seleccionada no es correcta, intente otra vez");
            }
        }while (elegirFigura != 0);
    }

    private static void crearCirculo(ArrayList<Figura> figuras) {
        double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo:"));
        figuras.add(new Circulo(radioCirculo));
    }

    private static void crearRectangulo(ArrayList<Figura> figuras) {
        double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del rectangulo:"));
        double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del rectangulo:"));
        figuras.add(new Rectangulo(baseRectangulo, alturaRectangulo));
    }

    private static void crearTriangulo(ArrayList<Figura> figuras) {
        double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo:"));
        double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triangulo:"));
        double lado1Triangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado 1 del triangulo:"));
        double lado2Triangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado 2 del triangulo:"));
        figuras.add(new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo));
    }

}
