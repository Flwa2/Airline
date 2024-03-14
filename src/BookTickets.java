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
        numOfBooking++;
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

    public void bookFlight(Flight[] f, Passenger p) {

        if (numOfBooking < flights.length) {
            boolean seatAvailable = true;
            for (int i = 0; i < numOfBooking; i++) {
                // p.setFlight(flight); // Set the flight information
                if (passengers[i] != null && passengers[i].getSeatCode().equals(p.getSeatCode())) {
                    seatAvailable = false;
                    break;
                }
            }
            // Check if the seat is available
            if (seatAvailable) {
                p.setFlight(f); // Set the flight information
                p.setBookingID(BookingID); // set bookid for passenger 
                passengers[numOfPassengers++] = p;
                System.out.println("\nFlight booked successfully for : " + p.getName() + "\n Booking ID: " + BookingID);
                numOfBooking++;

            } else {
                System.out.println("Cannot book flight. The seat is already booked.");  // the seat is booked
            }
        } else {
            System.out.println("Cannot book flight. All flights are Full.");          // the flights is full
        }
    }

    public void cancelFlight(String bookingID) {
        for (int i = 0; i < numOfBooking; i++) {
            if (flights[i] != null) {
                for (int j = 0; j < numOfPassengers; j++) {
                    if (passengers[j] != null && bookingID.equals(passengers[j].getBookID())) {
                        passengers[j] = null;
                    }
                }

            }
            for (int j = i; j < numOfBooking - 1; j++) {
                flights[j] = flights[j + 1];
            }
            flights[--numOfBooking] = null;
            System.out.println("Flight canceled successfully!");
            return;
        }
        System.out.println("Flight not found!");
    }

   // @Override
   // public String toString() {
    //    return "BookTickets information : \n" + "Booking ID : " + BookingID + "\n flights : " + Arrays.toString(flights) + "\n number Of Booking : " + numOfBooking;
    //}
public void displayTicketInfo(String bookingID) {
    boolean found = false;
    for (Passenger passenger : passengers) {
        if (passenger != null && bookingID.equals(passenger.getBookID())) {
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Passenger Passport Number: " + passenger.getPassportNumber());
            System.out.println("Passenger Mobile Number: " + passenger.getMobileNumber());
            System.out.println("Seat Code: " + passenger.getSeatCode());
            // Get flight information associated with this passenger
            Flight[] passengerFlights = passenger.getFlight();
            for (Flight flight1 : passengerFlights) {
                if (flight != null) {
                    System.out.println("Flight Information:");
                    System.out.println("Flight Number: " + flight1.getFlightNumber());
                    System.out.println("Departure City: " + flight1.getDepartureCity());
                    System.out.println("Arrival City: " + flight1.getArrivalCity());
                    System.out.println("Departure Time: " + flight1.getDeparture_time());
                    System.out.println("Arrival Time: " + flight1.getArrival_time());
                }
            }
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("No ticket found with the provided booking ID.");
    }
}
}
