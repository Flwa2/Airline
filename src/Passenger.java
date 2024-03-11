/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author FLWAH ALRASHED

public class Passenger {

    private String name;
    private String passportNumber;
    private String mobileNumber;
    private String seatNumber;
    private Flight flight; // to store flight information 

    public Passenger(String name, String passport, String mobile, String seatNumber) {
        this.name = name;
        passportNumber = passport;
        mobileNumber = mobile;
        this.seatNumber = seatNumber;
    }

    // Getter and Setter Method  to use it  for class BookTicket
    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
