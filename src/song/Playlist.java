package song;

import java.time.Duration;
import java.util.List;

public class Playlist {
    private static int SONGS_LENGHT = 0;

    public static int playListLenghtCalculator(List<Song> list) {
        for (Song song : list) {
            SONGS_LENGHT += song.getRecordLenght();
        }
        return SONGS_LENGHT;
    }

    public static String getFormattedTime(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
        String hoursPart = timeToString(hours);
        String minutesPart = timeToString(minutes);
        String secondsPart = timeToString(seconds);
        return hoursPart + ":" + minutesPart + ":" + secondsPart;
    }

    private static String timeToString(int hours) {
        String time;
        if (hours == 0)
            time = "00";
        else if (hours < 10)
            time = "0" + hours;
        else
            time = Integer.toString(hours);
        return time;
    }
}
