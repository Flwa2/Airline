/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class Seat {

    protected String seatCode;
    protected String seatType;
    protected int nextSeatNumber = 1;
    protected double price;
    protected int capacity;

    public Seat(String seatType, double price) {
        this.seatType = seatType;
        this.price = price;
        this.capacity = 170;
        this.seatCode = generateSeatCode();
    }

    private String generateSeatCode() {
        if (getSeatType() != null) {
            String seatNumber = String.format("A%02d", nextSeatNumber++);
            return getSeatType().substring(0, 1).concat(seatNumber);
        } else {
            return null;
        }

    }

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

}
