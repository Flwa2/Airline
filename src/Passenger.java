/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// @author FLWAH ALRASHED

public class Passenger {

    private String name;
    private String passportNumber;
    private String mobileNumber;
    private String seatCode;
    private String BookID;

    private Flight[] flight; // to store flight information 

    public Passenger(String name, String passportNumber, String mobileNumber, String seatCode) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.mobileNumber = mobileNumber;
        this.seatCode = seatCode;
    }

    // Getter and Setter Method
    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode;
    }

    public void setFlight(Flight[] flight) {
        this.flight = flight;
    }

    public void setBookingID(String ID) {
        this.BookID = ID;
    }

    public String getBookID() {
        return BookID;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getSeatCode() {
        return seatCode;
    }

    public Flight[] getFlight() {
        return flight;
    }

}
