package FlightControl;

import java.util.Scanner;

import FlightControl.logic.AirportAssetControl;
import FlightControl.ui.AirportAssetControlUI;
import FlightControl.ui.FlightControlUI;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        //Choose between AirportAssetControlUI and FlightControlUI..
        Scanner scanner = new Scanner(System.in);
        AirportAssetControl airportAssetControl = new AirportAssetControl();
        AirportAssetControlUI airUI = new AirportAssetControlUI(airportAssetControl,scanner);
        FlightControlUI flyUI = new FlightControlUI(airportAssetControl, scanner);
        while (true) { 
            System.out.println("Choose an action:");
            System.out.println("[1] Airport Asset Control");
            System.out.println("[2] Flight Control");
            System.out.println("[X] Exit Programm");
            String desci = scanner.nextLine();
            if(desci.equals("1")){
                airUI.startAirportAssetControlUI();
            }else if(desci.equals("2")){
                flyUI.startFlightControlUI();
            }else if(desci.equals("X")){
                break;
            }else{

            }
        
        
        }
        System.out.println("Bye");
}
}
