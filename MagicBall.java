package com.mycompany.chapter5;

import java.util.Scanner;

public class MagicBall {
        
    public static void main(String[] args) {
        //Create a scanner 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Magic 8-Ball!");
        System.out.print("Ask a yes-or-no question: ");
        scanner.nextLine(); //Take's the user question 
        
        System.out.println("\nThinking....");
        
        //1. Math.random() generates a double from
        //   0.0  up to 1.0 (but not inclusive) 
        //2. Multiply by 6 gives from 0.0 to 5.99999 
        //3. Casting to (int) chops off the decimals 
        //gives you 0, 1,2,3,4,5 
        
        int randomNumber = (int)( Math.random() * 6);
        
        //Deliver a fun response based on the
        //random number
        switch(randomNumber)
        {
            case 0: 
                System.out.println("Reply: It is certain!");
                break;
            case 1: 
                System.out.println("Reply: Outlook good");
                break;
            case 2: 
                System.out.println("Reply: Ask again later");
                break;
            case 3: 
                System.out.println("Reply: Better not tell"
                        + " you now!");
                break;
            case 4: 
                System.out.println("Reply: My sources "
                        + "say NO!");
                break;
            case 5: 
                System.out.println("Reply: Very doubtful!");
                break; 
                
                
        } //end switch 
        
        scanner.close();
        
        
    }
    
}
