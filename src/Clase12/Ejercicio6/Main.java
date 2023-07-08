package Clase12.Ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int optionPrincipalMenu;
        ArrayList<PlayList> playLists = new ArrayList<>();
        do {
            optionPrincipalMenu = Integer.parseInt(JOptionPane.showInputDialog("---------------- Menu ----------------" +
                                                                               "\n 0- Salir" +
                                                                               "\n 1- Crear playlist nueva" +
                                                                               "\n 2- Añadir canción a playlist" +
                                                                               "\n 3- Escuchar playlist" +
                                                                               "\n 4- Ver datos de una playlist"));
            switch (optionPrincipalMenu){
                case 0: break;
                case 1:
                    createPlayList(playLists);
                    break;
                case 2:
                    CreateSong(playLists);
                    break;
                case 3:
                    playPlayList(playLists);
                    break;
                case 4:
                    showPlayLists(playLists);
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción incorrecta, prueba otra vez");
            }

        }while (optionPrincipalMenu != 0);
    }

    private static void showPlayLists(ArrayList<PlayList> playLists) {
        String choosenPlayList = JOptionPane.showInputDialog("Ingresa el título de la playlist que quieres ver\n");
        boolean exist = playLists.stream()
                .anyMatch(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList));
        if(!exist) {
            JOptionPane.showMessageDialog(null, "La lista no existe");
        } else {
            playLists.stream()
                    .filter(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList))
                    .forEach(playList -> JOptionPane.showMessageDialog(null, playList.toString()));
        }
    }

    private static void playPlayList(ArrayList<PlayList> playLists) {
        String choosenPlayList = JOptionPane.showInputDialog("Ingresa el título de la playlist que quieres escuchar\n");
        long exist = playLists.stream()
                .filter(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList))
                .count();
        if(exist == 0) {
            JOptionPane.showMessageDialog(null, "La lista no existe");
        } else {
            playLists.stream()
                    .filter(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList))
                    .forEach(playList -> playList.playSongs());
        }
    }

    private static void CreateSong(ArrayList<PlayList> playLists) {
        String choosenPlayList = JOptionPane.showInputDialog("Ingresa el título de la playlist en la que quieras añadir la canción\n");
        boolean exist = playLists.stream()
                              .anyMatch(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList));
        if(!exist) {
            JOptionPane.showMessageDialog(null, "La lista no existe");
        } else {
            String songTitle = JOptionPane.showInputDialog("Ingresa el título de la canción");
            String songArtist = JOptionPane.showInputDialog("Ingresa el artista de la canción");
            double songlenght = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la duración de la canción"));
            playLists.stream()
                     .filter(playList -> playList.getTitle().equalsIgnoreCase(choosenPlayList))
                     .forEach(playList -> playList.setSongs(new Song(songTitle, songArtist, songlenght)));

        }
    }

    private static void createPlayList(ArrayList<PlayList> playLists) {
        String playListTitle = JOptionPane.showInputDialog("Ingresa el título de la playlist");
        playLists.add(new PlayList(playListTitle));
    }
}
