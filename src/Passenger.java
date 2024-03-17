/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Passenger {

    private String name;
    private String passportNumber;
    private String mobileNumber;
    private String seatCode;
    private String BookID;
    private Flight[] flights; // to store flight information 

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
        this.flights = flight;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
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
        return flights;
    }

}
