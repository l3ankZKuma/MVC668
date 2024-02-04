import java.util.ArrayList;
import java.util.List;

public class Model {
    private String songName;
    private int duration; // in seconds
    private String singers;
    private int score;

    private DataBaseExecute dbEx;



    public Model(String songName, int duration, String singers) {
        this.songName = songName;
        this.duration = duration;
        this.singers = singers;
        dbEx=new DataBaseExecute();
    }

    private void calculateScore() {
        Singer Calculator;
        int numSingers = singers.split(",").length;
        if (numSingers == 1) {
            Calculator = new oneSinger(dbEx);
        } else if (numSingers == 2) {
            Calculator = new twoSingers(dbEx);
        } else if (numSingers == 3) {
            Calculator = new threeSingers(dbEx);
        } else {
            // Handle unsupported number of singers
            return;
        }
        score = Calculator.calculateScore(duration, singers.split(" "));
    }


    public int getScore() {
        return score;
    }
    // Getters for songName, duration, singers, and score
}
