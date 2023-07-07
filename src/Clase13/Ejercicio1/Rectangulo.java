package Clase13.Ejercicio1;

public class Rectangulo extends Figura{
    private String tipoFigura = "Rectángulo";
    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public String getTipoFigura() {
        return tipoFigura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double calcularArea(){
        double area = getBase() * getAltura();
        return area;
    }
    @Override
    public  double calcularPerimetro(){
        double perimetro = 2 * getBase() + 2 * getAltura();
        return perimetro;
    }
}
