package Clase12;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] people= enterPeople();

        for (int i = 0; i < people.length; i++){
            String person = JOptionPane.showInputDialog("Ingresa tu nombre");
            String invisibleFriend = searchInvisibleFriend(people, person);
            JOptionPane.showMessageDialog(null, "Te ha tocado hacerle el regalo a " + invisibleFriend);
        }

    }
    public static String[] enterPeople(){
        int totalPeople = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas: "));

        String[] people = new String[totalPeople];

        System.out.println("Ingresa los nombres de las personas: ");
        for(int i = 0; i < people.length; i++){
            people[i] = JOptionPane.showInputDialog("Persona " + (i + 1) + ":");
        }
        return people;
    }
    public static int randomNumber(int min, int max){
        return (int) Math.round(Math.random() * (max - min));
    }
    public static String searchInvisibleFriend(String[] people, String person){
        String invisibleFriend = "";
        for(int i = 0; i < people.length; i++){
            int invisibleFriendIndex = randomNumber(0, people.length);

            if(people[invisibleFriendIndex] != "") {
                invisibleFriend = people[invisibleFriendIndex];
                people[invisibleFriendIndex] = "";
                break;
            }
        }
        if (invisibleFriend == ""){
            invisibleFriend = "Ya no hay más personas";
        }
        return invisibleFriend;
    }

}
