/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// @author FLWAH ALRASHED
import java.util.Arrays;

public class BookTickets {

    private String BookingID;
    private Flight[] flights; // List of available flights
    private int numOfBooking;

    //Constructer 
    public BookTickets(Flight[] flights) {

        this.flights = flights;
        this.numOfBooking = 0;
        this.BookingID = generateBookingID();

    }

    // Method to generate a unique booking ID
    private String generateBookingID() {
        String text = "FL";
        int randomNum = (int) (Math.random() * 1000000);  //random 6-digit
        // Combine the prefix with the random number
        return text + String.format("%06d", randomNum);
    }

    // Method to display information about available flights
    public void search() {
        System.out.println("Available flights:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }

    }

    @Override
    public String toString() {
        return "BookTickets information : \n" + "Booking ID : " + BookingID + "\n flights : " + Arrays.toString(flights) + "\n number Of Booking : " + numOfBooking;
    }

}
