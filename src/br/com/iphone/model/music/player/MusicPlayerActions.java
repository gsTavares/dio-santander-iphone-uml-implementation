package br.com.iphone.model.music.player;

import br.com.iphone.model.music.Song;

public interface MusicPlayerActions {
    
    void play();
    void pause();
    void selectSong(Song song);

}
