package Clase23.Ejercicio1;

public class Circulo implements IFiguraGeometrica{
    private double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String calcularArea() {
        double area = Math.PI * Math.pow(getRadio(), 2);
        return "El área del círculo es: " + area;
    }
}
