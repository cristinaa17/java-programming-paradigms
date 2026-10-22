package main.java.main;

import main.java.storage.ISensorData;
import java.util.Observer;
import java.util.Observable;

public class ConsoleLogger implements Observer  {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof ISensorData) {
            System.out.println(arg);
        }
    }
}
