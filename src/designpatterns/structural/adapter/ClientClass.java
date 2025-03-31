package designpatterns.structural.adapter;

// Client
public class ClientClass {

    public static void main(String[] args) {
        LegacyAudioPlayer legacyAudioPlayer = new LegacyAudioPlayer();
        MediaPlayerInterface mediaPlayerInterface = new AudioPlayerInterfaceAdapter(legacyAudioPlayer);
        mediaPlayerInterface.play("oldfile.wav");
    }
}
