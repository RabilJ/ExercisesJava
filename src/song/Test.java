package song;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Song>songs = new ArrayList<>();
        songs.add(new Song("Nothing Else Matters",300));
        songs.add(new Song("In The End",300));
        songs.add(new Song("Somewhere I Belong",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",300));
        songs.add(new Song("Allstar",69));

        System.out.println(Playlist.getFormattedTime(Playlist.playListLenghtCalculator(songs)));
    }
}
