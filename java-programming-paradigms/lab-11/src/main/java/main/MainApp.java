package main.java.main;

import main.java.storage.DataAggregator;
import main.java.storage.DataRepository;
import main.java.storage.DecoratedSensorData;
import main.java.storage.SensorData;
import main.java.main.ConsoleLogger;
import java.util.Scanner;

public class MainApp {
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        System.out.println("====================================================\n");
        System.out.printf("==== Choose a strategy: type '%sbasic%s' or '%sfiltered%s' \n",GREEN,RESET,GREEN,RESET);
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository =  DataRepository.getInstance();

        DataAggregator aggregator = new DataAggregator(Utils.getStrategy(strategyType));

        dataRepository.addObserver(aggregator);
        dataRepository.addObserver(new ConsoleLogger());

        long baseTimestamp = System.currentTimeMillis();


        baseTimestamp -= 62 * 1000; //one minute before
        dataRepository.addData(new DecoratedSensorData(new SensorData(450, baseTimestamp + 5)));
        dataRepository.addData(new DecoratedSensorData(new SensorData(-100, baseTimestamp + 6)));
        dataRepository.addData(new DecoratedSensorData(new SensorData(500, baseTimestamp + 70)));
        baseTimestamp += 62 * 1000; //back to present


        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        dataRepository.addData(new SensorData(30, baseTimestamp + 3));

        // After the first successful run, change this to  baseTimestamp - 60000  and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        dataRepository.addData(new SensorData(500, baseTimestamp + 600));


        System.out.println("====================================================");
        System.out.println( aggregator.getResults());
        System.out.println("====================================================");

    }
}
