package Clase12.Ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

public class PlayList {
    private String title;
    private ArrayList<Song> songs = new ArrayList<>();
    private int length = songs.size();

    public PlayList() {
    }

    public PlayList(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(Song song) {
        songs.add(song);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void playSongs(){
        getSongs().stream()
                  .forEach(song -> JOptionPane.showMessageDialog(null, "La canción que se esta reproduciendo es: \n"
                                                                                                            + song.toString()));
    }

    @Override
    public String toString() {
        return  "\n Title='" + title +
                "\n Length=" + length;
    }
}
