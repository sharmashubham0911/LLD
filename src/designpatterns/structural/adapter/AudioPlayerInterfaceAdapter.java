package designpatterns.structural.adapter;

// Adapter
public class AudioPlayerInterfaceAdapter implements MediaPlayerInterface {

    LegacyAudioPlayer legacyAudioPlayer;

    public AudioPlayerInterfaceAdapter(LegacyAudioPlayer legacyAudioPlayer){
        this.legacyAudioPlayer = legacyAudioPlayer;
    }

    @Override
    public void play(String filename) {
        legacyAudioPlayer.playAudio(filename);
    }
}
