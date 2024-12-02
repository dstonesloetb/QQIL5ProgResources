package com.mycompany.chapter5;

import java.util.ArrayList;

public class RandomDailyQuoteGenerator {
 
    public static void main(String[] args) {
        // Create an arraylist of inspirational
        // quotes
        
        // Create an ArrayList object
        ArrayList<String> quotes 
                = new ArrayList<String>(); 
        
        //add quotes to the list
        quotes.add("The way to get started is to quit talking and begin doing. -Walt Disney");
        quotes.add("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs");
        quotes.add("You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one. -John Lennon");
        quotes.add("Do one thing every day that scares you. -Eleanor Roosevelt");
        quotes.add("Well done is better than well said. -Benjamin Franklin");
        
        //Display the first quote stored in the arraylist 
        System.out.println(quotes.get(0));
        
        //Display the size of the arraylist
        System.out.println(quotes.size()+ " quotes in the list.");
        
        //Generate a random number 1 to 10 
        //Modify this code to get a random
        //number from 0 to 4 
        int randomInt = (int) Math.floor(Math.random()*4);
        System.out.println("Random Number: "+randomInt);
        
        //Display random quote 
        System.out.println(quotes.get(randomInt));
        
    } //end main 
    
} //end class
