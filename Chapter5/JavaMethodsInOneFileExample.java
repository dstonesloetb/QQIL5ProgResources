package com.mycompany.chapter5;

public class JavaMethodsInOneFileExample {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Calling myFunctionOne 
        //No Input, No Return
        myFunctionOne();
        
        //Calling myFuntionTwo
        //No Input, Return an int
        
        //Calling function 2 from the println function
        System.out.println(myFunctionTwo());
        
        //Calling function 2 and storing the
        //returned result from the function 
        int result = myFunctionTwo();
        System.out.println("Result: " + result);
        
        
        //Call function 3 and pass in an int value
        int x = 20;
        myFunctionThree(40);
        myFunctionThree(x);  //preferred approach
        // myFunctionThree();  FOUND NO ARGUMENTS 
        
        //call myFunctionFour - inputs , return 
        int speedCar = 130;
        int speedLimitRoad = 50;
        //boolean issueTicket = myFunctionFour(130, 50);
        boolean issueTicket = myFunctionFour(speedCar, speedLimitRoad);
        System.out.println("Issue ticket: "+issueTicket);
        
        
        System.out.println("Return to main method...");
        
    } //end main 

    //*****************************************
    
    //Function 1 - has no input, no return
    //displayMenu()
    public static void myFunctionOne() {
        System.out.println("Display Menu...");
    } //end of myFunctionOne

    //******************************************
    
    //Function 2 - no input, returning an int
    public static int myFunctionTwo() {
        //local variable
        int numOfVowels = 0; 
        
        //code to count vowels in a string
        
        return numOfVowels;
        
    } //end myFunctionTwo
    
    //*****************************************
    
    //Function 3 - input, no return
    //This function has one parameter variable num
    public static void myFunctionThree(int num)
    {
        //declare and initialise a local variable
        int num2 = 100; 
        int result = num + num2; 
        System.out.println(result);
    } //end myFunctionThree
    
    //***********************************************************
    //Scenario 4 - Yes Input, Yes Return
    //issueSpeedingTicket(int speed, int speedLimit)  2 int parameter vars
    public static boolean myFunctionFour(int speed, int speedLimit)
    {
                         //  130 > 50 -> true      TRUE : FALSE
        boolean result = (speed>speedLimit)      ? true : false ;  
        return result;
    }  //end myFunctionFour
    
    
} //end class 
