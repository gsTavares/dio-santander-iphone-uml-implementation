package br.com.iphone;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import br.com.iphone.model.Iphone;
import br.com.iphone.model.internet.Page;
import br.com.iphone.model.internet.Tab;
import br.com.iphone.model.internet.browser.InternetBrowser;
import br.com.iphone.model.music.Album;
import br.com.iphone.model.music.Artist;
import br.com.iphone.model.music.Song;
import br.com.iphone.model.music.player.MusicPlayer;
import br.com.iphone.model.phone.Contact;
import br.com.iphone.model.phone.device.PhoneDevice;

public class App {
    public static void main(String[] args) throws Exception {
        List<Song> songs = Arrays.asList(
            new Song("Hear me now", LocalTime.of(0, 3, 45), new Album("first realease", new Artist("Alok")), null),
            new Song("Clocks", LocalTime.of(0, 4, 23), new Album("test", new Artist("Coldplay")), null)
        );
        List<Contact> contacts = Arrays.asList(
            new Contact("17998425472", "Gustavo"),
            new Contact("17888423645", "Filho de Enil")
        );
        Iphone iphone = new Iphone(
            "1.0", 
            new MusicPlayer(songs), 
            new PhoneDevice(contacts), 
            new InternetBrowser()
        );

        iphone.turnOn();

        iphone.getIpod().selectSong(songs.get(0));
        iphone.getIpod().play();
        iphone.getIpod().pause();

        iphone.getPhone().call(contacts.get(0));
        iphone.getPhone().attend("17888423645");
        iphone.getPhone().attend("17884654888");

        iphone.getSafari().addNewTab(new Tab(0, new Page("Google", "www.google.com")));
        iphone.getSafari().showPage(0);
        iphone.getSafari().refreshPage(0);

        iphone.reset();
        iphone.turnOff();
    }
}
