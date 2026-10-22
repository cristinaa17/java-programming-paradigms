package main.java.storage;
import java.util.Observable;


public class DataRepository extends Observable {
    private static DataRepository instance;

    private DataRepository() {}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }
    public void addData(ISensorData data) {
        setChanged();
        notifyObservers(data);
    }

}


