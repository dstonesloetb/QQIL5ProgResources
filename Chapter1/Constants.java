package com.mycompany.chapter1;

public class Constants {
   
    public static void main(String[] args) {
        // Create some constant variables
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
        
        //Changing constant value 
        //TOUCHDOWN = 10;
        
        //Declare our variables
        int td, pat, fg, total;
        
        //Calculate the total score
        td = 4 * TOUCHDOWN;    //4*6=24
        pat = 3 * CONVERSION;  //3*1=3 
        fg = 2 * FIELDGOAL;  //2*3=6
        total = (td+pat+fg); //24+3+6=33
        
        //Output the total
        System.out.println("Score: "+total);
        
        
    } //end main
    
} //end class 
