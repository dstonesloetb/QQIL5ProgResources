package com.mycompany.chapter2;

public class Comparison {

    public static void main(String[] args) {
        // Declare and initialise variables
        int dozen = 12;
        int score = 20; 
        boolean result; 
        
        //Check is a dozen bigger than a score
        result = (dozen > score); //12>20->false
        //Output the result
        System.out.println("Is dozen > score: "+result);
        
        //Check is a score bigger than a dozen
        result = (score > dozen); //20>12->true
        //Output the result
        System.out.println("Is score > dozen: "+result);
        
        //Check if a dozen is not equal to a score
        //Using the inequality operator 
        result = (dozen != score);  //12!=20->true
        //Output the result
        System.out.println("Is dozen!=score: "+result);
        
        
    } //end main
    
} //end class 
