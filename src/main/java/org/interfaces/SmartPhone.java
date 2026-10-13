package org.interfaces;

public class SmartPhone implements Camera,MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Take a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music....");
    }
}
