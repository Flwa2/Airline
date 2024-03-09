/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FirstClass extends Seat {

    public FirstClass(String seatCode, String seattype, double price) {
        super(seatCode, seattype, price);
    }

    @Override
    public double Calculateprice() {

        return price * 4;

    }

    public void display() {
        System.out.println("THE COST OF " + seattype + "SEAT CODE " + seatCode + "IS " + price);
    }
}
