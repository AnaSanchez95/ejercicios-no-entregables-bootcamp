package Clase12.Ejercicio6;

public class Song {
    private String title;
    private String artist;
    private double length;

    public Song() {
    }

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return   "\n Title: " + title +
                "\n Artist: " + artist +
                "\n Length: " + length;
    }
}
