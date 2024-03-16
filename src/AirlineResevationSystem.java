/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class AirlineResevationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating airline with 10 flights
        Airline airline = new Airline("Saudi Airline", "SA", 10);
        //Creating Flight object with information 
        Flight[] flights = {
            new Flight("F100", "London", "Riyadh", "9:15", "14:30"),
            new Flight("F101", "New York", "Paris", "8:00", "21:45"),
            new Flight("F102", "Paris", "Jeddah", "10:30", "13:45"),
            new Flight("F103", "Riyadh", "Dubai", "11:45", "18:30"),
            new Flight("F104", "Tokyo", "Dammam", "15:20", "23:00")
        };

        airline.AddFlights(flights);

<<<<<<< Upstream, based on origin/master
        //Search for flights
        System.out.print("Enter the departure city: ");
        String departureCity = input.nextLine();
        System.out.print("Enter the arrival city: ");
        String arrivalCity = input.nextLine();

        // Search for flights from the specified departure city to the specified arrival city
        Flight[] FlightsDitals = airline.SearchFlight(arrivalCity, departureCity);

        // Display the search results
        if (FlightsDitals != null && FlightsDitals.length > 0) {
            System.out.println(" Ditals of available flights:");
            for (Flight flight : FlightsDitals) {
                if (flight != null) {
                    System.out.println(flight);
                }
            }
        } else {
            System.out.println("No available flights were found for the specified destination.");
        }
        if (FlightsDitals != null) {  // the menu will show up if flight ditals not null

        }
        BookTickets bookTickets = new BookTickets(50); // Creating a ticket booking system

=======
        BookTickets bookTickets = new BookTickets(Seat.totalCapacity); // Creating a ticket booking system 
        // Declare object and Variables 
        Passenger p;
        Flight[] Search;
        Seat seat;
        String Name;
        String passport;
        String mobile;
        int select;
>>>>>>> b2bd4f7 update All classes & i remove the comments
        int choice;
        String SeatCode = ""; // to assign seat code and pass it to class BookTickets 

        do {
            System.out.println("\nEnter your menu option:");
<<<<<<< Upstream, based on origin/master
             System.out.println("1.Show all available flights");
=======
            System.out.println("1. Show all available flights");
>>>>>>> b2bd4f7 update All classes & i remove the comments
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Search for flights");
            System.out.println("5. Display user ticket info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                //To show all available flights
                case 1:
                    System.out.println("All available flights:");
<<<<<<< Upstream, based on origin/master
        for (Flight flight : airline.getFlights()) {
            if (flight != null) {
                System.out.println(flight);
            }}
=======
                    for (Flight flight : airline.getFlights()) {
                        if (flight != null) {
                            System.out.println(flight);
                        }

                    }
                    break;

>>>>>>> b2bd4f7 update All classes & i remove the comments
                case 2:
                    //Book a seat
<<<<<<< Upstream, based on origin/master
                    System.out.print("Enter the departure city: ");
                     departureCity = input.nextLine();
                    System.out.print("Enter the arrival city: ");
                   arrivalCity = input.nextLine();
                   FlightsDitals = airline.SearchFlight(arrivalCity, departureCity);
                    int select;
                    System.out.print("Enter your name: ");
                    String Name = input.nextLine();
                    System.out.print("Enter passport number: ");
                    String passport = input.nextLine();
                    System.out.print("Enter your mobile number: ");
                    String mobile = input.nextLine();
=======
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
>>>>>>> b2bd4f7 update All classes & i remove the comments
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
<<<<<<< Upstream, based on origin/master
                                System.out.println("seat code: " + SeatCode);
                                bookTickets.bookFlight(FlightsDitals, new Passenger(Name, passport, mobile, SeatCode));
                           Seat.display( seat);
=======
                                bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                Seat.display(seat);
>>>>>>> b2bd4f7 update All classes & i remove the comments
                            }
                            break;
                        case 2:
                            seat = new Business("Business", 200.0);
                            if (seat instanceof Business) {
                                SeatCode = seat.generateSeatCode();
<<<<<<< Upstream, based on origin/master
                                System.out.println("seat code: " + SeatCode);
                                bookTickets.bookFlight(FlightsDitals, new Passenger(Name, passport, mobile, SeatCode));
                           Seat.display( seat);
=======
                                bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                Seat.display(seat);
>>>>>>> b2bd4f7 update All classes & i remove the comments
                            }
                            break;
                        case 3:
                            seat = new Economy("Economy", 100.0);
                            if (seat instanceof Economy) {
                                SeatCode = seat.generateSeatCode();
<<<<<<< Upstream, based on origin/master
                                System.out.println("seat code: " + SeatCode);
                                bookTickets.bookFlight(FlightsDitals, new Passenger(Name, passport, mobile, SeatCode));
                            Seat.display( seat);
=======
                                bookTickets.bookFlight(flights, new Passenger(Name, passport, mobile, SeatCode));
                                Seat.display(seat);
>>>>>>> b2bd4f7 update All classes & i remove the comments
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

<<<<<<< Upstream, based on origin/master
                 

=======
>>>>>>> b2bd4f7 update All classes & i remove the comments
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
<<<<<<< Upstream, based on origin/master
                
                      case 5:
=======

                case 5:
>>>>>>> b2bd4f7 update All classes & i remove the comments
                    //displaying user ticket info

                    System.out.print("Enter booking ID: ");
                    String bookingIDToDisplay = input.nextLine();
                    bookTickets.displayTicketInfo(bookingIDToDisplay);
                    break;
<<<<<<< Upstream, based on origin/master
               
                   
=======

>>>>>>> b2bd4f7 update All classes & i remove the comments
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Your selection is invalid. Please choose a number between 1 and 5.");
            }

        } while (choice != 6);

        input.close();
    }
}
