package designpatterns.structural.adapter;

// Adaptee
public class LegacyAudioPlayer {

    public void playAudio(String file){
        System.out.println("Playing Legacy Audio: " + file);
    }
}
