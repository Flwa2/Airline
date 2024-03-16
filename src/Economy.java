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
        return seatCode = "E" + String.format("%02d", nextSeatNumber++);

    }

    @Override
    public String getSeatType() {
        return "Economy";
    }

<<<<<<< Upstream, based on origin/master
  
=======
>>>>>>> b2bd4f7 update All classes & i remove the comments
}
