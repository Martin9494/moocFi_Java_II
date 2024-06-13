package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.FlightControl;



public class AirportAssetControlUI implements IAirportAssetControlUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public AirportAssetControlUI(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    @Override
    public void startAirportAssetControlUI() {
        while (true) { 
            System.out.print("Choose an action:\n[1] Add an airplane\n[2] Add a flight\n[X] Exit Airport Asset Control\n> ");
            String input = scanner.nextLine();
            if(input.equals("1")){
                addAirplane();
            }else if(input.equals("2")){
                addFlight();
            }else if(input.equals("X")){
                exitAirportAssetControlUI();
            }else{
                System.out.println("Please choose between\n[1] , [2] , [X]");
            }
        }
    }

    @Override
    public void addAirplane() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addFlight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exitAirportAssetControlUI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    



}
