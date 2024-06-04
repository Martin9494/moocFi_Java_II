
import java.util.ArrayList;
import java.util.HashMap;




public class Main {

    public static void main(String[] args) {
        
        ArrayList<LicensePlate> licensePlates = new ArrayList<>();
        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        LicensePlate first = new LicensePlate("Germany", "DEBBGG");
        LicensePlate secound = new LicensePlate("Germany", "HHFFKK");
        licensePlates.add(first);
        licensePlates.add(secound);

        String firstDriver = "Steven";
        String secondDriver = "Ellen";

        HashMap<LicensePlate, String> hashMap = new HashMap<>();
        hashMap.put(first, firstDriver);
        hashMap.put(secound, secondDriver);


        for (LicensePlate licensePlate : hashMap.keySet()) {
            if(vehicleRegistry.add(licensePlate, hashMap.get(licensePlate))){
                System.out.println("Added correctly");
            }else{
                System.out.println("Problem occured");
            }
        }
       
        vehicleRegistry.printOwners();
        vehicleRegistry.printLicensePlates();
        vehicleRegistry.remove(first);
        vehicleRegistry.printOwners();
        vehicleRegistry.printLicensePlates();
        System.out.println("next:");
        System.out.println(vehicleRegistry.get(secound));
        ;
        
        

    }
}
