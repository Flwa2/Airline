/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//exception class for indicating that no seats are available for booking.
public class NoSeatsAvailable extends Exception{

    public NoSeatsAvailable(String Message) {
        super(Message);
    }   
}
