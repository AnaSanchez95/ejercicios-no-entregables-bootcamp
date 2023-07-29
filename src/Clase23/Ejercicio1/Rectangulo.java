package Clase23.Ejercicio1;

public class Rectangulo implements IFiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String calcularArea() {
        double area = getAltura() * getBase();
        return "El área del rectángulo es: " + area;
    }
}
