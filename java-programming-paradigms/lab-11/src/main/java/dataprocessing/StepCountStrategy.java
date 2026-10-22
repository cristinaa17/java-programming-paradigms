package main.java.dataprocessing;

import main.java.storage.ISensorData;

public interface StepCountStrategy {

    /**
     * Consumes a sensor data sample
     * @param sample
     */
    void consumeMessage(ISensorData sample);

    int getTotalSteps();

    String getStrategyDescription();

}
