import java.util.*;

public class Pr31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            playlist.add(sc.nextLine());
        }

        System.out.println("\nPlaylist: " + playlist);

        
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + firstSong);
            System.out.println("Playlist after playing first song: " + playlist);
        }

      
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped: " + lastSong);
            System.out.println("Playlist after skipping last song: " + playlist);
        }

        sc.close();
    }
}

/*
Example Output:

Enter number of songs: 4
Enter song 1: Song A
Enter song 2: Song B
Enter song 3: Song C
Enter song 4: Song D

Playlist: [Song A, Song B, Song C, Song D]

Playing: Song A
Playlist after playing first song: [Song B, Song C, Song D]

Skipped: Song D
Playlist after skipping last song: [Song B, Song C]
*/
