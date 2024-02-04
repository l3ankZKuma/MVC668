import java.util.List;

public class oneSinger extends Singer {

    DataBaseExecute dbEx;
    public oneSinger(DataBaseExecute dbEx) {
        this.dbEx = dbEx;
    }
    public int calculateScore(){
        return dbEx.totalDuration()%100;
    }
}
