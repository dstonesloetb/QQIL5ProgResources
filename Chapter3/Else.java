package com.mycompany.chapter3;

public class Else {

    
    public static void main(String[] args) {
        //set the time
        int hrs = 20; //11am
        
        //Output an appropriate 
        //message depending time of day
        if (hrs<13)
        {
            System.out.println("Good morning: "+hrs);
        }
        else if (hrs<18)
        {
            System.out.println("Good Afternoon: "+hrs);
        }
        else 
        {
            System.out.println("Good Evening: "+hrs);
        }
        
    } //end main 
    
} //end class
