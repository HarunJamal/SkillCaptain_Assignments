interface MusicPlayer{

    abstract void play();
    abstract void pause();
    abstract void stop();

    abstract void addSong(String Song);

    abstract void removeSong(String Song);

}

class MyMusicPlayer implements MusicPlayer{
    
}

public class Main{
    public static void main(String[] args) {
        //Add at least five songs to the playlist using the `addSong()` method.
        //Play one of the songs using the `play()` method.
        // Pause the currently playing song using the `pause()` method.
        // Remove a song from the playlist using the `removeSong()` method.
        // Stop the currently playing song using the `stop()` method.
        
    }
}