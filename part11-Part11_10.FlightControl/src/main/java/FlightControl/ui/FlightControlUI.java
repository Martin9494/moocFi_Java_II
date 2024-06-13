package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.AirportAssetControl;


public class FlightControlUI implements IFlightControlUI{

    private AirportAssetControl airportAssetControl;
    private Scanner scanner;
    public FlightControlUI(AirportAssetControl airportAssetControl, Scanner scanner){
        this.airportAssetControl = airportAssetControl;
        this.scanner = scanner;
    }

    @Override
    public void startFlightControlUI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printAirplanes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printFlights() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printAirplaneDetails() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exitFlightControlUI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
