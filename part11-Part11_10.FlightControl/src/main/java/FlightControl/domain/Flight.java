package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place startPlace;
    private Place destinationPlace;

    public Flight(Airplane airplane, Place destinationPlace, Place startPlace) {
        this.airplane = airplane;
        this.destinationPlace = destinationPlace;
        this.startPlace = startPlace;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getStartPlace() {
        return this.startPlace;
    }

    public Place getDestinationPlace() {
        return this.destinationPlace;
    }
    
    @Override
    public String toString(){
        return this.getAirplane()+" ("+this.getStartPlace()+"-"+this.getDestinationPlace()+")";
    }

    

}
