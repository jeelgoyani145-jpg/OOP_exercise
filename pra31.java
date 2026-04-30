import java.util.LinkedList;

public class pra31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Full Playlist: " + playlist);

        String played = playlist.removeFirst();
        System.out.println("Playing: " + played);
        System.out.println("Playlist after playing first: " + playlist);

        String skipped = playlist.removeLast();
        System.out.println("Skipping: " + skipped);
        System.out.println("Playlist after skipping last: " + playlist);
    }
}
