
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleMap;

    public VehicleRegistry(){
        this.vehicleMap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(vehicleMap.get(licensePlate) == null){
            vehicleMap.put(licensePlate, owner);
            return true;
        }
        return false;

    }
    public void printLicensePlates(){
        for (LicensePlate key : vehicleMap.keySet()) {
            System.out.println(key);
            
        }
    }

    public void printOwners(){
        Set<String> set = new HashSet<>();
        
        for  (LicensePlate key : vehicleMap.keySet()) {
            set.add(vehicleMap.get(key));
            
        } 
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }




    public String get(LicensePlate licensePlate){
        return vehicleMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(vehicleMap.get(licensePlate) == null){
            return false;
        }else{
            vehicleMap.remove(licensePlate);
            return true;

        }
    }



}
