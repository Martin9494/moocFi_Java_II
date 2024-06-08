
import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Organism> movables;

    public Herd(){
        this.movables = new ArrayList<>();
    }
    public void addToHerd(Movable movable){

        movables.add(new Organism( movable.getX(), movable.getY()));

    }

    @Override
    public void move(int dx, int dy) {
        for (Organism organism : movables) {
            organism.move(dx, dy);
        }
    }

    //average
    @Override
    public int getX() {
        int sum = 0;
        int counter = 0;
        for (Organism organism : movables) {
            sum += organism.getX();
            counter++;
        }
        return  sum/counter;

    }
    //average
    @Override
    public int getY() {
        int sum = 0;
        int counter = 0;
        for (Organism organism : movables) {
            sum += organism.getY();
            counter++;
        }
        return  sum/counter;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();
        for (Movable movable : this.movables) {
            Organism mov = (Organism) movable;
            values.append("x: ").append(mov.getX())
                  .append("; y: ").append(mov.getY())
                  .append("\n");
        }
        return values.toString();
    }
    

}
