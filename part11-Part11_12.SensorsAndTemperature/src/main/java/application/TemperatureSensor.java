package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean active;
    

    public TemperatureSensor(){
        this.active = false;
        Random r = new Random();
        int low = -30;
        int high = 30;
       
    }
    @Override
    public boolean isOn() {
        return this.active;
    }

    @Override
    public void setOn() {
        this.active = true;
    }

    @Override
    public void setOff() {
        this.active = false;
    }

    @Override
    public int read() {
        if(this.active == false){
            throw new IllegalStateException("Sensor has to be setOn");
        }
        return this.generateRandom();
    }

    private int generateRandom(){
        Random r = new Random();
        int randomNumber = r.nextInt(31);
        int posOrNe   = r.nextInt(2);
        if(posOrNe == 0){
            randomNumber *= -1;
        }
        return randomNumber;
    }

}
