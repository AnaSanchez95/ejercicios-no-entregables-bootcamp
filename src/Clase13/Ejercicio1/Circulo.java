package Clase13.Ejercicio1;

public class Circulo extends Figura{
    private String tipoFigura = "Círculo";
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public String getTipoFigura() {
        return tipoFigura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double area = Math.PI *  Math.pow(getRadio(), 2);
        return area;
    }
    @Override
    public  double calcularPerimetro(){
        double perimetro = Math.PI * (getRadio() * 2);
        return perimetro;
    }
}
