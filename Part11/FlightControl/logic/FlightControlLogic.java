package logic;

import domain.Airplane;
import domain.Flight;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightControlLogic {
    ArrayList<Airplane> allAirplanes;
    ArrayList<Flight> allFlights;

    public FlightControlLogic() {
        this.allAirplanes = new ArrayList<>();
        this.allFlights=new ArrayList<>();

    }

    public void addFlight(Flight flight) {
        this.allFlights.add(flight);
    }

    public void printAllFlights() {
        for (Flight item : allFlights) {
            System.out.println(item);
        }
    }

    public void getFlight(String search){
        for(Airplane item:allAirplanes){
            if(item.getAirplaneID().equals(search)){
                System.out.println(item);
            }
        }
    }

    public void addAirplane(Airplane airplane) {
        this.allAirplanes.add(airplane);
    }

    public void printAllAirplanes() {
        for (Airplane item : allAirplanes) {
            System.out.println(item);
        }
    }
}
