package StructuralPatterns.AdapterPattern.Challenge;

public class Mp4Player implements AdvanceMediaPlayerInterface{

    String filename;

    @Override
    public void loadFilename(String filename) {

        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing MP4 file.  Name: "+ filename);
    }

}
