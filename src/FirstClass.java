/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FirstClass extends Seat {


    public FirstClass(String seattype, double price) {
        super(seattype, price);
    }

    @Override
    public double Calculateprice() {

        return price * 4;

    }

    @Override
    protected String generateSeatCode() {
        if (nextSeatNumber <= capacity) {
            seatCode = String.format("%02d", nextSeatNumber++);
            return "F" + seatCode;
        } else {
            return null;
        }
    }

    @Override
    public String getSeatType() {
        return "First Class";
    }

    public void display() {
        System.out.println("THE COST OF " + seatType + "SEAT CODE " + seatCode + "IS " + price);
    }
}
