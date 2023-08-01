package Clase25.Ejercicio;

public class CurrencyConverter {
    private static CurrencyConverter instance;
    public static CurrencyConverter getInstance(){
        if (instance == null) {
            instance = new CurrencyConverter();
        }
        return instance;
    }
    private CurrencyConverter(){}
    public double convertirEuroADolar(double dinero){
        return dinero / 0.91;
    }
    public double convertirDolarAEuro(double dinero){
        return dinero * 0.91;
    }
}
