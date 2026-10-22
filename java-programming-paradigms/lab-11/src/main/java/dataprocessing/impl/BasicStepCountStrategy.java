package main.java.dataprocessing.impl;
import main.java.dataprocessing.StepCountStrategy;
import main.java.storage.ISensorData;

public class BasicStepCountStrategy implements StepCountStrategy {
    private int totalSteps = 0;

    @Override
    public void consumeMessage(ISensorData sd) {
        totalSteps += sd.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return this.getClass().getName();
    }
}
