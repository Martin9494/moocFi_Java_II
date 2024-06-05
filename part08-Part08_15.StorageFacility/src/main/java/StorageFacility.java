
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> stored;

    public StorageFacility(){
        this.stored = new HashMap<>();
    }

    public void add(String unit, String item){
        this.stored.putIfAbsent(unit, new ArrayList<>());
        this.stored.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.stored.getOrDefault(storageUnit,
        new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        ArrayList<String> items = this.stored.get(storageUnit);
        if(items != null){
            items.remove(item);
            if(items.isEmpty()){
                this.stored.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<>(this.stored.keySet());
    }

    






}
