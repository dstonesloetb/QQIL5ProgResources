package com.mycompany.intro.exercises;

public class AmusementParkGuard {
   
    public static void main(String[] args) {
        // Guest details      
        int guestHeight = 145; // in cm
        int guestAge = 11;

        // WRITE YOUR CODE HERE:
        boolean isTallEnough = guestHeight >= 120; // Evaluates to true
        
        boolean isTooTall = guestHeight > 200;    // Evaluates to false
        
        boolean isOldEnough = guestAge >= 10;     // Evaluates to true

        // Bonus: combining them together
        // Evaluates to true
        boolean canRide = isTallEnough && !isTooTall 
                            && isOldEnough; 

        //Output results
        System.out.println("Amusement Park Guard");
        System.out.println("--------------------");
        System.out.println("Is Tall enough: "+isTallEnough);
        System.out.println("Is Too Tall: "+isTooTall);
        System.out.println("Is Old Enough: "+isOldEnough);
        System.out.println("Can Ride: "+canRide);
        
        
        

    } //end main 
    
} //end class 
