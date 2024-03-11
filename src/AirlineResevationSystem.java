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
        Flight flight1 = new Flight("F100", "Riyadh", "London", "9:15", "14:30", 200);
        Flight flight2 = new Flight("F101", "New York", "Paris", "8:00", "21:00", 150);
        airline.AddFlight(flight1);
        airline.AddFlight(flight2);

        BookTickets bookTickets = new BookTickets(10); // Creating a ticket booking system

        int choice;
        String seatNumber = ""; // to assign seat code and send it to class BookTickets 

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel reservation");
            System.out.println("3. Search for flights");
            System.out.println("4. Display user ticket info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    int select;
                    System.out.print("Enter your name: ");
                    String Name = input.nextLine();
                    System.out.print("Enter passport number: ");
                    String passport = input.nextLine();
                    System.out.print("Enter your mobile number: ");
                    String mobile = input.nextLine();

                    do {
                        System.out.println("Select the type of seat:");
                        System.out.println("1. First Class");
                        System.out.println("2. Business");
                        System.out.println("3. Economy ");
                        System.out.println("4. Exit booking seat");
                        System.out.print("Please select your seats :");
                        select = input.nextInt();
                    } while (!(select >= 1 && select <= 3));  //until user selects a valid option

                    Seat seat;  // Declare object

                    switch (select) {
                        case 1:
                            seat = new FirstClass("First Class ", 400.0);
                            if (seat instanceof FirstClass) {
                                FirstClass firstClassSeat = (FirstClass) seat;
                                System.out.println("seat code: " + firstClassSeat.getSeatCode());
                                seatNumber = firstClassSeat.getSeatCode();
                            }
                            break;
                        case 2:
                            seat = new Business("Business", 200.0);
                            if (seat instanceof Business) {
                                Business businessSeat = (Business) seat;
                                System.out.println("seat code: " + businessSeat.getSeatCode());
                                seatNumber = businessSeat.getSeatCode();
                            }
                            break;
                        case 3:
                            seat = new Economy("Economy", 100.0);
                            if (seat instanceof Economy) {
                                Economy economySeat = (Economy) seat;
                                System.out.println("seat code: " + economySeat.getSeatCode());
                                seatNumber = economySeat.getSeatCode();
                            }
                            break;

                        default:
                            System.out.println("Exiting...");
                            System.exit(0);
                    }
                    Flight flight = flight1;

                    bookTickets.bookFlight(flight, Name, passport, mobile, seatNumber);

                    break;

                case 2:
                    // Implement canceling reservation functionality
                    break;
                case 3:
                    // Implement searching for flights functionality
                    break;
                case 4:
                    // Implement displaying user ticket info functionality
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        input.close();
    }
}
