/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class Seat {

    protected String seatCode;
    protected String seattype;
    protected double price;

    public Seat(String seatCode, String seattype, double price) {

        this.seatCode = seatCode;
        this.seattype = seattype;
        this.price = price;
    }

    public abstract double Calculateprice();

}
