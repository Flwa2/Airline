/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Economy extends Seat {

    public Economy(String seattype, double price) {
        super(seattype, price);
    }

    @Override
    public double Calculateprice() {

        return price;

    }

    @Override
    protected String generateSeatCode() {
        if (nextSeatNumber <= capacity) {
            seatCode = String.format("%02d", nextSeatNumber++);
            return "E" + seatCode;
        } else {
            return null;
        }
    }

    @Override
    public String getSeatType() {
        return "Economy";
    }

  
}
