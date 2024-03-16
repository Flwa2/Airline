/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public abstract class Seat {

    protected String seatCode;
    protected String seatType;
    protected double price;
    protected int capacity;
    protected Flight flight;
    protected static int nextSeatNumber = 1;  //Shared amoung FirstClass , Buisness , Economy to count number of seats 
    protected static int totalCapacity = 270;

    public Seat(String seatType, double price) {
        this.seatType = seatType;
        this.price = price;
    }

    protected abstract String generateSeatCode();

    public abstract double Calculateprice();

    public String getSeatType() {
        return seatType;
    }

    public String getSeatCode() {
        return seatCode;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode;
    }

    public double getPrice() {
        price = Calculateprice();
        return price;
    }

    public static void display(Seat seat) {
        System.out.println("The cost of " + seat.seatType + "\nSeat code :" + seat.getSeatCode() + " is " + seat.getPrice());
    }
}
