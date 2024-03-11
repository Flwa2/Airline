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
    public String getSeatType() {
        return "Economy";
    }

    public void dispaly() {
        System.out.println("THE COST OF " + seatType + "SEAT CODE " + seatCode + "IS " + price);
    }

}
