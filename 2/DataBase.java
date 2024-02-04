import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private String songName;
    private String duration; // in seconds
    private String singer;

    public DataBase(String songName, String duration, String singer) {
        this.songName = songName;
        this.duration = duration;
        this.singer = singer;
    }

    public String getDuration() {
        return duration;
    }

    public String getSinger() {
        return singer;
    }

    public String getSongName() {
        return songName;
    }


}
