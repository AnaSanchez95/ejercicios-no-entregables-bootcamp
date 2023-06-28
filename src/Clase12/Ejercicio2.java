package Clase12;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double cashHandedOver = enterCashHandedOverdata();
        double total = enterTotalData();
        returnCashCalculation(cashHandedOver, total);
    }
    public static double enterCashHandedOverdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero entregada: ");
        return scanner.nextDouble();
    }
    public static double enterTotalData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese total compra: ");
        return scanner.nextDouble();
    }
    public static void returnCashCalculation(double cashHandedOver, double total){
        Double moneyReturn = cashHandedOver - total;
        Double[] cashReturn = new Double[1000];
        Double[] bills = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0};
        Double[] coins = {2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        int cashReturnIndex = 0;
        int changeBillsToCoins = 0;


            for(int i = 0; i < bills.length; i++){
                while (moneyReturn >= bills[i]){
                    if((moneyReturn - bills[i]) == 0){
                        cashReturn[cashReturnIndex] = bills[i];
                        moneyReturn -= bills[i];
                        changeBillsToCoins++;
                        break;
                    } else if ((moneyReturn - bills[i]) > 0) {
                        cashReturn[cashReturnIndex] = bills[i];
                        cashReturnIndex++;
                        moneyReturn -= bills[i];
                        changeBillsToCoins++;
                    }
            }
        }
            for (int i = 0; i < coins.length; i++){
                while (moneyReturn >= coins[i]){
                if((moneyReturn - coins[i]) == 0){
                    cashReturn[cashReturnIndex] = coins[i];
                    moneyReturn -= coins[i];
                    break;
                } else if ((moneyReturn - coins[i]) > 0) {
                    cashReturn[cashReturnIndex] = coins[i];
                    cashReturnIndex++;
                    moneyReturn -= coins[i];
                }
            }
        }

        showReturnMoney(cashReturn, changeBillsToCoins);
    }

    private static void showReturnMoney(Double[] cashReturn, int changeBillsToCoins) {
        System.out.print("Los billetes ha devolver son: ");
        for (int h = 0; h < changeBillsToCoins; h++){
            if(cashReturn[h] != null){
                System.out.print(cashReturn[h] + " ");
            }
        }
        System.out.print("\nLas monedas a devolver son: ");
        for (int h = changeBillsToCoins; h < cashReturn.length; h++){
            if(cashReturn[h] != null){
                System.out.print(cashReturn[h] + " ");
            }
        }
    }
}
