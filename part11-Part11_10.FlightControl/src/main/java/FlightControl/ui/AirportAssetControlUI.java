package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.AirportAssetControl;



public class AirportAssetControlUI implements IAirportAssetControlUI {
    private AirportAssetControl airportAssetControl;
    private Scanner scanner;
    private boolean active;

    public AirportAssetControlUI(AirportAssetControl airportAssetControl, Scanner scanner){
        this.airportAssetControl = airportAssetControl;
        this.scanner = scanner;
        this.active = true;
    }

    @Override
    public void startAirportAssetControlUI() {
        initialize();
        while (this.active) { 
            System.out.print("Choose an action:\n[1] Add an airplane\n[2] Add a flight\n[X] Exit Airport Asset Control\n> ");
            String input = scanner.nextLine();
        
            if(input.equals("1")){
                addAirplane();
            }else if(input.equals("2")){
                addFlight();
            }else if(input.equals("X")){
                exitAirportAssetControlUI();
            }else{
                System.out.println("This won't work\n");
            }
        }
    }

    private void initialize(){
        this.active = true;
    }

    @Override
    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String name = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = 0;
        try {
            capacity = Integer.parseInt(scanner.nextLine());
            airportAssetControl.addAirplane(name, capacity);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            System.out.println(name+" was not added.");
        }
    }

    @Override
    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String name = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String startPlace = scanner.next();
        System.out.println("Give the target airport id: ");
        String destinationPlace = scanner.next();
        airportAssetControl.addFlight(airportAssetControl.getAirplane(name), startPlace, destinationPlace);

    }

    @Override
    public void exitAirportAssetControlUI() {
        this.active = false;
    }
    

    



}
