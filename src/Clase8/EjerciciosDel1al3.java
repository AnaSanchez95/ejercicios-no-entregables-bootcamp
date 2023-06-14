package Clase8;

public class EjerciciosDel1al3 {
    public static void main(String[] args) {
        System.out.println(squareArea(2,2));
        System.out.println(triangleArea(2, 6));
        passwordGenerator(10);
    }
    public static double squareArea(double side1, double side2){
        double area = side1 * side2;
        return area;
    }
    public static double triangleArea(double base, double height){
        double area = (base * height) / 2;
        return area;
    }
    public static void passwordGenerator(int length){
        String password = "";
        for (int i = 0; i < length; i++){
            password += String.valueOf(randomNumber(0, 10));
            password += randomCharacter();
        }
        System.out.println(password);
    }
    public static int randomNumber(int min, int max){
        int number = (int) Math.round(Math.random() * (max - min) + min);
        return number;
    }
    public static char randomCharacter(){
        char character = (char) randomNumber(97, 122);
        return character;
    }
}
