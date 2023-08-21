package Clase27;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    public static void main(String[] args) {
    Map<String, String> agenda = new HashMap<>();
    int option;

    do {
        option = Integer.parseInt(JOptionPane.showInputDialog("---------------- Menu ----------------" +
                                                                "\n 0- Salir" +
                                                                "\n 1- Agregar contacto" +
                                                                "\n 2- Buscar contacto" +
                                                                "\n 3- Eliminar contacto" +
                                                                "\n 4- Ver agenda"));
        switch (option) {
            case 0:
                break;
            case 1:
                agregarContacto(agenda);
                break;
            case 2:
                buscarPorNombre(agenda);
                break;
            case 3:
                eliminar(agenda);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, agenda);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, prueba otra vez");
        }
    } while(option !=0);

}
    private static void buscarPorNombre(Map<String, String> agenda) {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre")
                                    .toLowerCase();

        if (agenda.containsKey(nombre)){
            JOptionPane.showMessageDialog(null, "El telefono de " + nombre + " es " + agenda.get(nombre));
        }
        else {
            JOptionPane.showMessageDialog(null, "El contacto no existe");
        }
    }

    private static void agregarContacto(Map <String, String> agenda) {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre")
                                    .toLowerCase();
        String telefono = JOptionPane.showInputDialog("Ingresa en número de telefono");
        agenda.put(nombre, telefono);
        JOptionPane.showMessageDialog(null, "El contancto ha sido guardado correctamente");
    }
    private static void eliminar(Map <String, String> agenda){
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre")
                .toLowerCase();

        if (agenda.containsKey(nombre)){
            agenda.remove(nombre);
            JOptionPane.showMessageDialog(null, "Contacto eliminado correctamente");
        }
        else {
            JOptionPane.showMessageDialog(null, "El contacto no existe");
        }
    }


}
