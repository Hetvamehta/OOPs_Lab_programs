import java.util.LinkedList;

public class MusicPlaylistSimulator {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        System.out.println("Hetva-25");
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist after adding songs: " + playlist);

        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("Playing first song: " + firstSong);
            System.out.println("Playlist after playing first song: " + playlist);
        }

        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("Skipping last song: " + lastSong);
            System.out.println("Playlist after skipping last song: " + playlist);
        }
    }
}
