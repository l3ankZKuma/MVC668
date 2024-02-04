public class threeSingers extends Singer {


    private DataBase db;
    public threeSingers(DataBaseExecute dbEx) {
        this.db = db;
    }

    public int calculateScore (int duration, String... singers) {
        int totalSingersLength = 0;
        for (String singer : singers) {
            totalSingersLength += singer.length();
        }
        return (totalSingersLength * singers[0].length()) % 100;
    }
}
