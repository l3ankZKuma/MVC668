import java.util.List;

public class DataBaseExecute {

    private List<DataBase> dbList;


    public DataBaseExecute() {
        this.dbList = dbList;
    }



    public void addDataBase(DataBase db) {
        dbList.add(db);
    }


    public int getSize(){
        return dbList.size();
    }

    public int totalDuration() {
        int totalDuration = 0;
        for (DataBase db : dbList) {
            totalDuration += Integer.parseInt(db.getDuration());
        }
        return totalDuration;
    }

}
