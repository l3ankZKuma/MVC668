public class twoSingers extends Singer {


    DataBase db;

    public twoSingers(DataBaseExecute dbEx) {
        this.db = db;
    }
    public int calculateScore(int duration, String... singers) {
        return (duration % 100);
    }
}
