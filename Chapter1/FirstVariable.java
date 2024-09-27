package com.mycompany.introexamples;

public class FirstVariable {

    public static void main(String[] args) {
        //Declare a constant variable
        final int MAX_SCORE = 100;
        
        //Output the max score
        System.out.println("Max Score: " + MAX_SCORE);
        
        //Update the max score
        //MAX_SCORE = 1000;
        
        // Declare and initialise a variable
        int score = 0;
        
        //Output the score 
        System.out.println("Score is: "+score);
        
        //update the score 
        // score++;
        score = score + 1; //1 = 0+1
        
        //Output the updated score 
        System.out.println("Updated Score is: "+score);
        
    }//end main
    
}//end class 
