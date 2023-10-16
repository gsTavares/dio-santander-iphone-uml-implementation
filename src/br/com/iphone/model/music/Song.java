package br.com.iphone.model.music;

import java.io.File;
import java.time.LocalTime;

public class Song {
    
    private String name;
    private LocalTime duration;
    private Album album;
    private File file;
    
    public Song() {
    }

    public Song(String name, LocalTime duration, Album album, File file) {
        this.name = name;
        this.duration = duration;
        this.album = album;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void play() {
        System.out.println("Playing song " + this.name);
    }

    public void pause() {
        System.out.println("Pausing song " + this.name);
    }

}
