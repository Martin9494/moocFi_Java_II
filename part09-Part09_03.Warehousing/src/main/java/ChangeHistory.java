
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add (double status){
        this.history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public String toString(){
        return this.history.toString();
    }
    public double maxValue() {
        double val = (double) Collections.max(this.history);
        return val;
    }
    public double minValue(){
        double val = (double) Collections.min(this.history);
        return val;

    }
    public double average(){
        int counter = 0;
        double sum = 0;
        for (Double double1 : this.history) {
            sum += double1;
            counter++;
        }

        return (double) sum/counter;

    }


}
