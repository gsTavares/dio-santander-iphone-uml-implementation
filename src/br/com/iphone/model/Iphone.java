package br.com.iphone.model;

import br.com.iphone.model.internet.browser.InternetBrowser;
import br.com.iphone.model.music.player.MusicPlayer;
import br.com.iphone.model.phone.device.PhoneDevice;

public class Iphone {
    
    private String version;
    private MusicPlayer ipod;
    private PhoneDevice phone;
    private InternetBrowser safari;
    
    public Iphone() {
    }

    public Iphone(String version, MusicPlayer ipod, PhoneDevice phone, InternetBrowser safari) {
        this.version = version;
        this.ipod = ipod;
        this.phone = phone;
        this.safari = safari;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MusicPlayer getIpod() {
        return ipod;
    }

    public void setIpod(MusicPlayer ipod) {
        this.ipod = ipod;
    }

    public PhoneDevice getPhone() {
        return phone;
    }

    public void setPhone(PhoneDevice phone) {
        this.phone = phone;
    }

    public InternetBrowser getSafari() {
        return safari;
    }

    public void setSafari(InternetBrowser safari) {
        this.safari = safari;
    }

    public void turnOn() {
        System.out.println("Starting iphone device...");
    }

    public void turnOff() {
        System.out.println("Shutting down iphone device...");
    }

    public void reset() {
        System.out.println("Restarting iphone device...");
    }

}
