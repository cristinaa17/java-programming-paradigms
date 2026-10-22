package main.java.storage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DecoratedSensorData implements ISensorData  {
    private ISensorData wrapee;

    public DecoratedSensorData(ISensorData wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public long getTimestamp() {
        return wrapee.getTimestamp();
    }

    @Override
    public int getStepsCount() {
        return wrapee.getStepsCount() + 20;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        Date resultDate = new Date(wrapee.getTimestamp());
        return String.format("steps=%5d   time=%s", getStepsCount(), sdf.format(resultDate));
    }
}
