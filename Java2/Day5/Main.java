import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

interface MusicPlayer {
    void play();
    void pause();
    void stop();
    void addSong(String song);
    void removeSong(String song);
}

class MyMusicPlayer implements MusicPlayer {
    List<String> playlist;
    boolean isPlaying;

    public MyMusicPlayer() {
        this.playlist = new ArrayList<String>();
        this.isPlaying = false;
    }

    @Override
    public void play() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing: " + playlist.get(0));
            isPlaying = true;
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Paused: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Stopped: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    @Override
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added song: " + song);
    }

    @Override
    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MyMusicPlayer();
        char c;
        String songName;
        Scanner input = new Scanner(System.in);
        

        do {
            System.out.println("Enter number beside option to select:");
            System.out.println("1) Add song\n2) Play song\n3) Pause\n4) Stop\n5) Remove Song\n6) Show playlist\n--------------------");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name of song you want to add:");
                    input.nextLine();
                    songName = input.nextLine();
                    player.addSong(songName);
                    break;
                case 2:
                    player.play();
                    break;
                case 3:
                    player.pause();
                    break;
                case 4:
                    player.stop();
                    break;
                case 5:
                    System.out.println("Enter name of song you want to remove:");
                    songName = input.nextLine();
                    player.removeSong(songName);
                    break;
                case 6:
                System.out.println("Playlist\n--------------");
                for (String song : ((MyMusicPlayer) player).playlist) {
                    System.out.println(song);
                }
                    break;
            
                default:
                    break;
            }


            System.out.println("Would you like to continue? (press y to continue, anything else to exit): ");
            c = input.next().charAt(0);
            
        } while (c == 'y' || c == 'Y');

        /*player.addSong("Song 1");
        player.addSong("Song 2");
        player.addSong("Song 3");
        player.addSong("Song 4");
        player.addSong("Song 5");

        player.play();
        player.pause();

        player.removeSong("Song 3");

        player.stop();
        */
        input.close();
    }
}

