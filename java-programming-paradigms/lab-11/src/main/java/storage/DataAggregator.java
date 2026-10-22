package main.java.storage;

import java.util.Observable;
import java.util.Observer;
import main.java.dataprocessing.StepCountStrategy;



public class DataAggregator implements Observer  {

    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof ISensorData) {
            strategy.consumeMessage((ISensorData) arg);
        }

    }
}
