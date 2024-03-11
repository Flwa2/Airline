/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Business extends Seat {

    public Business(String seattype, double price) {
        super(seattype, price);
    }

    @Override
    public double Calculateprice() {

        return price * 2;

    }
      @Override
    public String getSeatType() {
       return "Business";
    }

    public void dispaly() {
        System.out.println("THE COST OF " + seatType + "SEAT CODE " + seatCode + "IS " + price);
    }
}
