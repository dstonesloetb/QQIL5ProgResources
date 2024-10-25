package com.mycompany.chapter3;

public class WhileLoopExample {

    public static void main(String[] args) {
        // Output the numbers 0 to 4
        
        // 1. initialise the counter
        // for the while loop before
        // the while loop
        int i = 0;
        
        // 2. test condition for the while loop
        // Keep repeating the block of code
        // while the test condition is true
        while (i<5)
        {
            //for each iteration of the loop
            //output the current
            //value of the loop counter
            System.out.println("Counter value: "+i);
            
            //update the counter
            i++;
            
        } //end while 
        
        //*********************
        System.out.println("\n");
        
        //Countdown example
        int countdown =3; //loop counter
        
        //countdown from 3,2,1 
        while (countdown > 0)
        {
            System.out.println(countdown);
            countdown--;  //update counter
        }
        
        System.out.println("Happy New Year!!!");
        
        //*********************
        System.out.println("\n");
        
        //set the dice to 1 at start of game
        int dice = 1; 

        //Keep playing until we throw a 6
        while (dice <= 6) {
          if (dice < 6) {
            System.out.println("No Yatzy.");
          } else {          //win with a 6 
            System.out.println("Yatzy!");
          } //end if 
          dice = dice + 1;  //update the counter 
        } //end while
        
        
        //*********************
        System.out.println("\n");

        //while loop with a boolean variable
        
        boolean inProgress = true;
        
        while (inProgress)  //keep looping while true 
        {
            System.out.println("Game in progress..");
            
            //implement game logic
            
            inProgress = false;  //exit game 
        } //end while 
        
        System.out.println("\nGame Over");
        
        
        
    } //end main 
    
} //end class 
