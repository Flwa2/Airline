/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Flight {
//
//    private int FlightNumber ;
//	private String ArrivalCity;
//	private String DepartureCity;
//	private String Arrival_time;
//	private String Departure_time;
//	private Seat [] listOfSeats;
//	public int nOs;

    private String FlightNumber;
    private String ArrivalCity;
    private String DepartureCity;
    private String Arrival_time;
    private String Departure_time;
    private Seat[] listOfSeats;     // Array to add passengers in the seats
    private Passenger[] passengers; // Array to add passengers 
    public int nOs; // number of seats 
    private int numOfPassenger;  // number of passengers 

    public Flight(String FlightNumber, String arrivalCity, String departureCity, String arrival_time,
            String departure_time, int numSeats) {
        this.FlightNumber = FlightNumber;
        ArrivalCity = arrivalCity;
        DepartureCity = departureCity;
        Arrival_time = arrival_time;
        Departure_time = departure_time;
        listOfSeats = new Seat[numSeats];
        passengers = new Passenger[numSeats];
        nOs = numSeats;
        this.numOfPassenger = 0;
    }

//    public boolean AddSeat(Seat s) { //To add the given seat to the array in the first empty location and return true. If there is no space for the addition return false.
//        if (nOs < listOfSeats.length) {
//            listOfSeats[nOs++] = s;
//            return true;
//        }
//    }
    // Getter Methods 
    public String getFlightNumber() {
        return FlightNumber;
    }

    public Seat[] getListOfSeats() {
        return listOfSeats;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public int getnOs() {
        return nOs;
    }

    public int getNumPassengers() {
        return numOfPassenger;
    }

    public void AddSeat(Seat s) {
        if (numOfPassenger < nOs) {
            listOfSeats[numOfPassenger] = s;
            numOfPassenger++;
        } else {
            System.out.println("No seats are available ");
        }

    }

    // return true if there is seat available, false if there is not seat available.
    public boolean checkAvailbility() {
        return nOs < listOfSeats.length;
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
    public String toString() {  // Method to print FlightNumber , ArrivalCity ,DepartureCity, Arrival_time, Departure_time, array listOfSeats, nOs.
        String str = "Flight FlightNumber : " + FlightNumber
                + "\nArrival City : " + ArrivalCity + "\nDepartureCity : "
                + DepartureCity + "\nArrival time : " + Arrival_time + "\nDeparture_time : " + Departure_time
                + " \n number Of seat : " + nOs;

        for (Seat listOfSeat : listOfSeats) {
            str = str + listOfSeat.toString();
        }
        return str;
    }

}
