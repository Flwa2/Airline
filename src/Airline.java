/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import javax.swing.JOptionPane;

public class Airline {

    private String name;
    private String AirlineCode;
    private Flight[] flights;
    private int nOf;

    public Airline(String name, String airlineCode, int size) {
        this.name = name;
        AirlineCode = airlineCode;
        flights = new Flight[size];
        nOf = 0;
    }

    public void AddFlights(Flight[] newFlights) { //To add the given flight to the array in the first empty location. 

        for (Flight newFlight : newFlights) 
            if (nOf < flights.length) 
                flights[nOf++] = newFlight;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public Flight[] SearchFlight(String DeCity, String ArCity) { // returns array contains information about a flight if the given ArrivalCity & DepartureCity is exists in any flight, otherwise return null

        Flight listOfFlights[] = new Flight[nOf];
        int j = 0;
        for (int i = 0; i < nOf; i++) {
            if (flights[i].getArrivalCity().equalsIgnoreCase(ArCity) && flights[i].getDepartureCity().equalsIgnoreCase(DeCity)) {
                listOfFlights[j++] = flights[i];
            }
        }

        if (j != 0) {
            return listOfFlights;
        } else {
            return null;
        }

    }

    public boolean isValidFlight(String departureCity, String arrivalCity) { // returns true if the given ArrivalCity & DepartureCity is exists in any flight and != null, otherwise return false.
        for (Flight flight : flights) {
            if (flight != null && flight.getDepartureCity().equalsIgnoreCase(departureCity) && flight.getArrivalCity().equalsIgnoreCase(arrivalCity)) {
                return true;
            }
        }
        return false;
    }
    public void save (String fileName){
        try{
        File out =new File (fileName);
        FileOutputStream fos =new FileOutputStream (out);
        
        ObjectOutputStream file =new  ObjectOutputStream (fos);
        
        file.writeInt(nOf);
        file.writeObject(name);
        
        for (int i=0; i<nOf;i++)
            file.writeObject(flights[i]);
        file.close();
        JOptionPane.showMessageDialog(null,"Done saving");
        }  catch(IOException e ){
            JOptionPane.showMessageDialog(null,"error"+e.toString()); 
            
        }
    }
    public void loud (String fileName){
        try{
        File f =new File (fileName); 
        FileInputStream fi = new FileInputStream (f);
          ObjectInputStream in =new  ObjectInputStream (fi);
          int size =in.readInt();
          String Name=(String) in.readObject();
          name=Name;
           Flight [] F=new  Flight[size];
          for(int i=0;i<size;i++){
         
         
              F [i] =(Flight)in.readObject();
            
            this.AddFlights(F);
            in.close();
          }}
          catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error reading");      
                  }
         catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error "+ e.toString() );      
        }
}}

