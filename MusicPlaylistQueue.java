import java.util.LinkedList;
import java.util.Scanner;

class MusicPlayer {
    private LinkedList<String> playlist = new LinkedList<>();

    public void addSong(String song) {
        playlist.addLast(song);
        System.out.println("Added: " + song);
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            String song = playlist.removeFirst();
            System.out.println("Now playing: " + song);
        } else {
            System.out.println("Playlist is empty!");
        }
    }

    public void showPlaylist() {
        System.out.println("Current Playlist: " + playlist);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found in playlist.");
        }
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }
}

class MediaPlayer extends MusicPlayer {
}

// Main class
public class MusicPlaylistQueue {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Song\n2. Play Next\n3. Show Playlist\n4. Remove Song\n5. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    player.addSong(song);
                    break;
                case 2:
                    player.playNext();
                    break;
                case 3:
                    player.showPlaylist();
                    break;
                case 4:
                    System.out.print("Enter song to remove: ");
                    String remove = scanner.nextLine();
                    player.removeSong(remove);
                    break;
                case 5:
                    System.out.println("Exiting Player...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
