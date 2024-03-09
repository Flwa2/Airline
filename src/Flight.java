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

    public boolean AddSeat(Seat s) {
        if (nOs < listOfSeats.length) {
            listOfSeats[nOs++] = s;
            return true;
        }
        return false;
    }

    public boolean checkAvailbility() {
        if (nOs < listOfSeats.length) {
            return true;
        } else {
            return false;
        }
    }

    public int Capacity() {
        return listOfSeats.length;
    }

    public String getArrivalCity() {
        return ArrivalCity;
    }

    public String getDepartureCity() {
        return DepartureCity;
    }

    @Override
    public String toString() {
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
