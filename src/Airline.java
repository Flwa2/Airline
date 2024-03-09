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

    public boolean AddFlight(Flight f) {
        if (nOf < flights.length) {
            flights[nOf++] = f;
            return true;
        }
        return false;
    }

    public boolean removeFlight(Flight f) {
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

    public String SearchFlight(String ArCity, String DeCity) {
        String str = "";
        for (int i = 0; i < nOf; i++) {
            if (flights[i].getArrivalCity().equals(ArCity) && flights[i].getDepartureCity().equals(DeCity)) {
                str = str + flights[i].toString();
            }
        }
        if (str == "") {
            return "Sorry not found";
        } else {
            return str;
        }

    }

}
