package FlightControl.logic;

import java.util.HashMap;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class AirportAssetControl {
    HashMap<String, Airplane> allAirplanes;
    HashMap<String, Flight>   allFlights;
    HashMap<String, Place>    allPlaces;

    public AirportAssetControl(){
        this.allAirplanes = new HashMap<>();
        this.allFlights = new HashMap<>();
        this.allPlaces = new HashMap<>();
    }

    public void addAirplane(String name, int capacity){
        Airplane plane = new Airplane(name, capacity);
        this.allAirplanes.put(name, plane);
    }

    public void addFlight(Airplane plane, String startPlace, String destinationPlace){
        this.allPlaces.putIfAbsent(startPlace, new Place(startPlace));
        this.allPlaces.putIfAbsent(destinationPlace, new Place(destinationPlace));

        Flight flight = new Flight(plane, this.allPlaces.get(startPlace), this.allPlaces.get(destinationPlace));
        this.allFlights.put(flight.toString(), flight);
    }

    //get all airplanes
    //get all flights
    //get specific airplane

    public Airplane getAirplane(String name){
        return allAirplanes.get(name);
    }





}
