/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AirlineResevationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating airline with 20 flights
        Airline airline = new Airline("Saudi Airline", "SA", 20);
        //Creating Flight object with information 
        Flight[] flights = {
            new Flight("F100", "Riyadh", "London", "9:15", "14:30"),
            new Flight("F101", "Paris", "New York", "8:00", "21:45"),
            new Flight("F102", "Jeddah", "Paris", "10:30", "13:45"),
            new Flight("F103", "Riyadh", "Dubai", "11:45", "18:30"),
            new Flight("F104", "Dammam", "Tokyo", "15:20", "23:00"),
            new Flight("F105", "Hong Kong", "Berlin", "13:00", "4:30"),
            new Flight("F106", "Singapore", "Sydney", "10:45", "16:15"),
            new Flight("F107", "Los Angeles", "Chicago", "17:30", "9:00"),
            new Flight("F108", "Dubai", "Moscow", "14:15", "18:30"),
            new Flight("F109", "Beijing", "Tokyo", "8:30", "14:45"),
            new Flight("F110", "San Francisco ", "Seoul", "12:00", "15:30"),
            new Flight("F111", "Abu Dahbi", "New Delhi", "20:00", "8:30"),
            new Flight("F112", "Rome", "Athens", "11:30", "13:15"),
            new Flight("F113", "Riyadh", "Cairo", "9:45", "12:00")
        };

        airline.AddFlights(flights);
        writeFlightsToFile("flights.txt", flights);
        // Create a login frame
        Login log = new Login();
        log.setVisible(true);

        BookTickets bookTickets = new BookTickets(Seat.totalCapacity); // Creating a ticket booking system 

        // Declare object and Variables 
        //Passenger p;
        Flight[] Search;
        Seat seat;
        String Name;
        String passport;
        String mobile;
        int select;
        int choice = 0;
        String SeatCode = ""; // to assign seat code and pass it to class BookTickets 

        do {
            System.out.println("\nEnter your menu option:");
            System.out.println("1. Show all available flights");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Search for flights");
            System.out.println("5. Display user ticket info");
            System.out.println("6. Exit");
            try {
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                input.nextLine(); // Consume invalid input
                continue; // Restart the loop
            }
            switch (choice) {
                //To show all available flights
                case 1:
                    System.out.println("All available flights:");
                    for (Flight flight : airline.getFlights()) {
                        if (flight != null) {
                            System.out.println(flight);
                        }

                    }
                    break;

                case 2:
                    //Book a seat
                    System.out.print("\nEnter the departure city: ");
                    String departureCity = input.nextLine();
                    System.out.print("Enter the arrival city: ");
                    String arrivalCity = input.nextLine();
                    // Check if the entered cities match the flights information or not
                    if (airline.isValidFlight(departureCity, arrivalCity)) {
                        System.out.print("Enter your name: ");
                        Name = input.nextLine();
                        System.out.print("Enter passport number: ");
                        passport = input.nextLine();
                        System.out.print("Enter your mobile number: ");
                        mobile = input.nextLine();
                    } else {
                        System.out.println("No available flights were found for the specified destination.");
                        break;
                    }
                    do {
                        System.out.println("Select the type of seat:");
                        System.out.println("1. First Class");
                        System.out.println("2. Business");
                        System.out.println("3. Economy ");
                        System.out.println("4. Exit booking seat");
                        System.out.print("Please select your seats :");
                        select = input.nextInt();

                    } while (!(select >= 1 && select <= 3));  //until user selects a valid option

                    switch (select) {
                        //select the type of seats
                        case 1:
                            seat = new FirstClass("First Class ", 400.0);
                            if (seat instanceof FirstClass) {
                                SeatCode = seat.generateSeatCode();
                                try {
                                    bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                    Seat.display(seat);
                                } catch (NoSeatsAvailable e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case 2:
                            seat = new Business("Business", 200.0);
                            if (seat instanceof Business) {
                                SeatCode = seat.generateSeatCode();
                                try {
                                    bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                    Seat.display(seat);
                                } catch (NoSeatsAvailable e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case 3:
                            seat = new Economy("Economy", 100.0);
                            if (seat instanceof Economy) {
                                SeatCode = seat.generateSeatCode();
                                try {
                                    bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                    Seat.display(seat);
                                } catch (NoSeatsAvailable e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;

                        default:
                            System.out.println("Exiting...");
                            System.exit(0);
                    }
                    break;

                case 3:         //Cancel reservation
                    System.out.print("Enter booking ID to cancel: ");
                    String bookingID = input.nextLine();
                    bookTickets.cancelFlight(bookingID);
                    break;

                case 4:
                    //Search for flights
                    System.out.print("Enter the departure city: ");
                    String DCity = input.nextLine();    //assign the DCity to pass it to airline Search
                    System.out.print("Enter the arrival city: ");
                    String ACity = input.nextLine();    //assign the Acity to pass it to airline Search
                    // Check if the entered cities match the flights information or not
                    if (airline.isValidFlight(DCity, ACity)) {
                        Search = airline.SearchFlight(ACity, DCity);
                        if (Search != null && Search.length > 0) {
                            System.out.println("Search Results:");
                            for (Flight flight : Search) {
                                if (flight != null) {
                                    System.out.println(flight);
                                }
                            }
                        }
                    } else {
                        System.out.println("No available flights were found for the specified destination.");
                    }

                    break;

                case 5:
                //displaying user ticket info

                /*   System.out.print("Enter booking ID: ");
                    String bookingIDToDisplay = input.nextLine();
                    bookTickets.displayTicketInfo(bookingIDToDisplay);
                    System.out.println("-------------------------------");
                    break;*/
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Your selection is invalid. Please choose a number between 1 and 5.");
            }

        } while (choice != 6);

        input.close();
    }

    // Writes flight information to a text file.
    protected static void writeFlightsToFile(String filename, Flight[] flights) {
        try (FileOutputStream fos = new FileOutputStream(filename); PrintWriter writer = new PrintWriter(fos)) {
            for (Flight flight : flights) {
                if (flight != null) {
                    writer.println(flight.getFlightNumber() + ","
                            + flight.getDepartureCity() + ","
                            + flight.getArrivalCity() + ","
                            + flight.getDeparture_time() + ","
                            + flight.getArrival_time());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
