package StructuralPatterns.AdapterPattern.Challenge;

public class AdvanceMediaPlayerAdapter implements MediaPlayerInterface {
    AdvanceMediaPlayerInterface advanceMusicPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayerInterface advanceMusicPlayer) {
        this.advanceMusicPlayer = advanceMusicPlayer;
    }

    @Override
    public void play(String audioType, String filename) {

        advanceMusicPlayer.loadFilename(filename);
        advanceMusicPlayer.listen();

    }
}
