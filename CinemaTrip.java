
package com.mycompany.chapter2;

import java.util.Scanner;

public class CinemaTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //Output program header
        System.out.println("CINEMA TRIP PROGRAM");
        System.out.println("-------------------");

        // 1. Gather inputs from the user
        System.out.print("Adult tickets: ");
        int adultTickets = input.nextInt();

        System.out.print("Adult price: ");
        double adultPrice = input.nextDouble();

        System.out.print("Student tickets: ");
        int studentTickets = input.nextInt();

        System.out.print("Student price: ");
        double studentPrice = input.nextDouble();

        System.out.print("Snacks: ");
        double snackCost = input.nextDouble();

        // 2. Perform the calculations
        double totalTicketCost = (adultTickets * adultPrice) + (studentTickets * studentPrice);
        double totalCost = totalTicketCost + snackCost;

        // 3. Display the final results formatted to 2 decimal places
        System.out.println(); // Prints a blank line for spacing
        System.out.printf("Ticket cost: EUR %.2f%n", totalTicketCost);
        System.out.printf("Total cost:  EUR %.2f%n", totalCost);

        input.close();
    }
}
