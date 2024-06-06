
import java.util.ArrayList;



public class Box implements Packable {

    private double capacity;

    private ArrayList<Packable> packables;



    public Box(double capacity){
        this.capacity = capacity;

        this.packables = new ArrayList<>();
        
    }

    //just for the 100%
    @Override
    public double weight() {
        double weight = 0;

        // calculate the total weight of the items in the box
        for (Packable packable : packables) {
            weight += packable.weight();
        }
        return weight;
    }

    private double getCapacity(){
        return this.capacity;
    }



    public void add(Packable packable){
        if(isBox(packable)){
            System.out.println("its a box!");
            Box boxc = (Box) packable;
            this.capacity = this.capacity - boxc.getCapacity();
            this.packables.add(packable);
        }else if(this.capacity >= this.weight() + packable.weight()){
            packables.add(packable);
        }
    }
    @Override
    public String toString(){
        return "Box: "+this.packables.size()+" items, total weight "+this.weight()+" kg";
    }

    private boolean isBox(Object object){
        return object instanceof Box;

    }






}
