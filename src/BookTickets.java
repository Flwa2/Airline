/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// @author FLWAH ALRASHED
public class BookTickets {

    private String BookingID;
    private Flight[] flights;       //an array of Flight objects 
    private Passenger[] passengers; //an array of Passenger objects
    private Flight flight;          // Flight object
    private int numOfBooking;       //represents number of bookings.
    private int numOfPassengers;    //represents number of Passengers.

    //Constructer 
    public BookTickets(int Capacity) {
        this.BookingID = generateBookingID();
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

    public void bookFlight(Flight[] flight, Passenger passenger) {

        if (numOfPassengers < passengers.length) {
            passenger.setFlight(flight);
            // Book the flight
            passengers[numOfPassengers++] = passenger;
            String bookingID = generateBookingID();
            passenger.setBookID(bookingID);
            System.out.println("\nFlight booked successfully for : " + passenger.getName() + "\nBooking ID: " + bookingID);
            numOfBooking++;
        } else {
            System.out.println("Cannot book flight. The seats are full.");
        }
    }

    public void cancelFlight(String bookingID) {
        boolean Cancelbooking = false;
        for (int i = 0; i < numOfPassengers; i++) {
            if (passengers[i] != null && passengers[i].getBookID().equals(bookingID)) {
                passengers[i] = null;
                System.out.println("Booking canceled successfully!");
                numOfBooking--;
                Cancelbooking = true;
                break;
            }
        }
        if (!Cancelbooking) {
            System.out.println("Booking not found!");
        }
    }

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
                    if (flight1 != null) {
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
