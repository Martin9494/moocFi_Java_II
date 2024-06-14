package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensorList;
    private List<Integer> doneReadings;

    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.doneReadings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if(sensor.isOn() == false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensorList.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensorList.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if(this.isOn() == false || this.sensorList.isEmpty()){
            throw new IllegalStateException("Are there any Sensors added?\nAre all sensors on?");
        }
        long counter = this.sensorList.stream().count();
        long sum    = this.sensorList.stream().mapToLong(n -> n.read()).sum();
        this.doneReadings.add((int) ((int) sum/counter));
        return (int) ((int) sum/counter);
    }   
    public List<Integer> readings(){
        return this.doneReadings.stream().map(n -> n).collect(Collectors.toList());
    }
}
