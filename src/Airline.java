/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Airline {

    private String name;
    private String AirlineCode;
    private Flight[] flights;
    private int nOf;

    public Airline(String name, String airlineCode, int size) {
        this.name = name;
        AirlineCode = airlineCode;
        flights = new Flight[size];
        nOf = 0;
    }

    public void AddFlights(Flight[] newFlights) { //To add the given flight to the array in the first empty location. 

        for (Flight newFlight : newFlights) {
            if (nOf < flights.length) {
                flights[nOf++] = newFlight;
            } else {
                // out of the loop
                break;
            }
        }

    }

    public boolean removeFlight(Flight f) { //receives a flight and removes the flight (replace the deleted one with the last element in the array). Returns true if the deletion was done successfully and false if the given flight is not found.
        for (int i = 0; i < nOf; i++) {
            if (flights[i] == f) {
                flights[i] = flights[nOf - 1];
                nOf--;
                flights[nOf] = null;
                return true;
            }
        }
        return false;
    }
<<<<<<< Upstream, based on origin/master
=======

    public Flight[] getFlights() {
        return flights;

    }

>>>>>>> b2bd4f7 update All classes & i remove the comments
    public Flight[] SearchFlight(String ArCity, String DeCity) { // returns array contains information about a flight if the given ArrivalCity & DepartureCity is exists in any flight, otherwise return null

        Flight listOfFlights[] = new Flight[nOf];
        int j = 0;
        for (int i = 0; i < nOf; i++) {
            if (flights[i].getArrivalCity().equalsIgnoreCase(ArCity) && flights[i].getDepartureCity().equalsIgnoreCase(DeCity)) {
                listOfFlights[j++] = flights[i];
            }
        }

        if (j != 0) {
            return listOfFlights;
        } else {
            return null;
        }

    }
<<<<<<< Upstream, based on origin/master
     public Flight[] getFlights() {
    
    return flights;
}
=======

    public boolean isValidFlight(String departureCity, String arrivalCity) {
        for (Flight flight : flights) {
            if (flight != null && flight.getDepartureCity().equalsIgnoreCase(departureCity) && flight.getArrivalCity().equalsIgnoreCase(arrivalCity)) {
                return true;
            }
        }
        return false;
    }

>>>>>>> b2bd4f7 update All classes & i remove the comments
}
