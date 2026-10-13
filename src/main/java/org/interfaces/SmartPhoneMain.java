package org.interfaces;

public class SmartPhoneMain {
    public static void main(String[] args) {
        Camera cam = new SmartPhone();
        cam.takePhoto();
        MusicPlayer music = new SmartPhone();
        music.playMusic();
    }
}
