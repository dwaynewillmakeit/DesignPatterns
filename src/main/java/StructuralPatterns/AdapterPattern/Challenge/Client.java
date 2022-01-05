package StructuralPatterns.AdapterPattern.Challenge;

public class Client {

    public static void main(String[] args) {

        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","MyMusic.mp3");

        AdvanceMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advanceMediaPlayerAdapter = new AdvanceMediaPlayerAdapter(mp4Player);
        advanceMediaPlayerAdapter.play("mp4","music.mp4");

        AdvanceMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advanceMediaPlayerAdapter2 = new AdvanceMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayerAdapter2.play("vlc","music.vlc");

        audioPlayer.play("avi","movie.avi");
    }
}
