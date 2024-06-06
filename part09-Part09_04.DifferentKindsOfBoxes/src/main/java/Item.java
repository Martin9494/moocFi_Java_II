


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Item)){
            return false;
        }

        Item itemInstance = (Item) object;

        if(this.getName().equals(itemInstance.getName())){
            return true;
        }

        return false;
    }
    @Override
    public int hashCode(){
        return this.getName().hashCode();
    }

}
