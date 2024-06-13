package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.AirportAssetControl;


public class FlightControlUI implements IFlightControlUI{

    private AirportAssetControl airportAssetControl;
    private Scanner scanner;
    private  boolean active;

    public FlightControlUI(AirportAssetControl airportAssetControl, Scanner scanner){
        this.airportAssetControl = airportAssetControl;
        this.scanner = scanner;
        this.active = true;
    }

    @Override
    public void startFlightControlUI() {
        initialize();
        while (this.active) { 
            System.out.print("Choose an action:\n[1] Print airplanes\n[2] Print flights\n[3] Print airplane details\n" + //
                                "[X] Quit\n> ");
            String input = scanner.nextLine();
        
            if(input.equals("1")){
                printAirplanes();
            }else if(input.equals("2")){
                printFlights();
            }else if(input.equals("3")){
                printAirplaneDetails();
            }else if(input.equals("X")){
                exitFlightControlUI();
            }else{
                System.out.println("This won't work\n");
            }
        }
    }

    private void initialize(){
        this.active = true;
    }

    @Override
    public void printAirplanes() {
        System.out.println(airportAssetControl.getAllAirplains());
    }

    @Override
    public void printFlights() {
        System.out.println(airportAssetControl.getAllFlights());
    }

    @Override
    public void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        String name = scanner.nextLine();
        System.out.println(airportAssetControl.getAirplane(name));
    }

    @Override
    public void exitFlightControlUI() {
        this.active = false;
    }

}
