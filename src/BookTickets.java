/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// @author FLWAH ALRASHED
import java.util.Arrays;

public class BookTickets {

    private String BookingID;
    private Flight[] flights; // Lists of available flights
    private Passenger[] passengers;
    private Flight flight;
    private int numOfBooking;
    private int numOfPassengers;

    //Constructer 
    public BookTickets(int Capacity) {
        this.BookingID = generateBookingID();
        flights = new Flight[Capacity];
        passengers = new Passenger[Capacity];
        this.numOfBooking = 0;
        numOfPassengers = 0;
    }

    // Method to generate a unique booking ID
    private String generateBookingID() {
        String text = "FL";
        int randomNum = (int) (Math.random() * 1000000);  //random 6-digit
        return text + String.format("%06d", randomNum);
    }

    public String getBookingID() {
        return BookingID;
    }

    public void bookFlight(Flight flight, String passengerName, String passportNumber, String mobileNumber, String seatNumber) {
        if (numOfBooking < flights.length) {
            boolean seatAvailable = true;
            for (int i = 0; i < numOfPassengers; i++) {
                if (passengers[i] != null && passengers[i].getFlight().equals(flight) && passengers[i].getSeatNumber().equals(seatNumber)) {
                    seatAvailable = false;
                    break;
                }
            }
            // Check if the seat is available
            if (seatAvailable) {
                Passenger passenger = new Passenger(passengerName, passportNumber, mobileNumber, seatNumber);
                passenger.setFlight(flight); // Set the flight information
                passengers[numOfPassengers++] = passenger;
                System.out.println("Flight booked successfully for passenger: " + passenger.getName());
            } else {
                System.out.println("Cannot book flight. The seat is already occupied.");
            }

            // Book the flight
            flights[numOfBooking++] = flight;
        } else {
            System.out.println("Cannot book flight. All flights are booked.");
        }
    }

    public void bookFlight(Flight flight) {
        if (numOfBooking < flights.length) {
            flights[numOfBooking++] = flight;
            System.out.println("Flight booked successfully!");
        } else {
            System.out.println("Unable to book flight. All seats have been reserved");
        }
    }

    public void cancelFlight(Flight flight) {
        for (int i = 0; i < numOfBooking; i++) {
            if (flights[i].equals(flight)) {
                // Remove passengers associated with the canceled flight
                for (int j = 0; j < numOfPassengers; j++) {
                    if (passengers[j] != null && passengers[j].getFlight().equals(flight)) {
                        passengers[j] = null;
                    }
                }

                // Shift remaining elements to fill the gap
                for (int j = i; j < numOfBooking - 1; j++) {
                    flights[j] = flights[j + 1];
                }
                flights[--numOfBooking] = null;
                System.out.println("Flight canceled successfully!");
                return;
            }
        }
        System.out.println("Flight not found!");
    }

    // Method to Search for Available Flight.
    public Flight[] search() {
        Flight[] available = new Flight[flights.length];
        int count = 0; //to count available flights
        System.out.println("Available flights:");
        for (Flight f : flights) {
            if (f != null && f.checkAvailbility()) { // check if the flight is available
                available[count++] = f;
            }
        }
        Flight[] result = new Flight[count];
        for (int i = 0; i < count; i++) {
            result[i] = available[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "BookTickets information : \n" + "Booking ID : " + BookingID + "\n flights : " + Arrays.toString(flights) + "\n number Of Booking : " + numOfBooking;
    }

}
