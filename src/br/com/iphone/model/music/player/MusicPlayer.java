package br.com.iphone.model.music.player;

import java.util.List;
import java.util.Optional;

import br.com.iphone.model.music.Song;

public class MusicPlayer implements MusicPlayerActions {
    
    List<Song> songs;
    Song currentSong;

    public MusicPlayer() {

    }

    public MusicPlayer(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    @Override
    public void pause() {
        Optional.ofNullable(this.currentSong).ifPresent(song -> song.pause());
    }

    @Override
    public void play() {
        Optional.ofNullable(this.currentSong).ifPresent(song -> song.play());
    }

    @Override
    public void selectSong(Song song) {
        this.currentSong = song;
    }

    

}
