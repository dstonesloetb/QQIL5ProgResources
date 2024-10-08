package com.mycompany.chapter3;

public class DoWhileExample1 {

    public static void main(String[] args) {
        
        //Purpose: Outcome the numbers 0 to 4
        
        //Initialise counter for the do while loop
        int i = 0;
        
        //Always execute the code
        //inside the do-while at least once
        
        do {
            //For each iteration of the do while loop
            //Output the current value of the loop counter
            System.out.println(i);
            
            //incrementing the loop counter
            i++;
            
            //keep looping while 
            //the test condition is true 
        } while (i < 5);   

    }  //end main 
    
} //end class 

