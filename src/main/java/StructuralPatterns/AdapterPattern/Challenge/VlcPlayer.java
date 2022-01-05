package StructuralPatterns.AdapterPattern.Challenge;

public class VlcPlayer  implements AdvanceMediaPlayerInterface{

    String filename;

    @Override
    public void loadFilename(String filename) {

        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file.  Name: "+ filename);
    }
}
