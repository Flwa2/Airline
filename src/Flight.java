/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Flight {

    private int FlightNumber;
    private String ArrivalCity;
    private String DepartureCity;
    private String Arrival_time;
    private String Departure_time;
    private Seat[] listOfSeats;
    public int nOs;

    public Flight(int flightNumber, String arrivalCity, String departureCity, String arrival_time,
            String departure_time, int size) {
        FlightNumber = flightNumber;
        ArrivalCity = arrivalCity;
        DepartureCity = departureCity;
        Arrival_time = arrival_time;
        Departure_time = departure_time;
        listOfSeats = new Seat[size];
        nOs = 0;
    }

    public boolean AddSeat(Seat s) { //To add the given seat to the array in the first empty location and return true. If there is no space for the addition return false.
        if (nOs < listOfSeats.length) {
            listOfSeats[nOs++] = s;
            return true;
        }
        return false;
    }

    public boolean checkAvailbility() { // return true if there is seat available, false if there is not seat available.
        if (nOs < listOfSeats.length) {
            return true;
        } else {
            return false;
        }
    }

    public int Capacity() { //To return number of seats in the flight.
        return listOfSeats.length;
    }

    public String getArrivalCity() { //To return Arrival city.
        return ArrivalCity;
    }

    public String getDepartureCity() { // To return Departure city.
        return DepartureCity; 
    }

    @Override
    public String toString() { // 
        String str = "Flight FlightNumber : " + FlightNumber 
                + "\nArrival City : " + ArrivalCity + "\nDepartureCity : "
                + DepartureCity + "\nArrival time : " + Arrival_time + "\nDeparture_time : " + Departure_time
                + " \n number Of seat : " + nOs;

        for (Seat listOfSeat : listOfSeats) {
            str = str + listOfSeat.toString();
        }
        return null;
    }

}
