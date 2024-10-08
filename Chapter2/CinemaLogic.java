// import scanner class 
import java.util.Scanner;

class CinemaLogic {
  public static void main(String[] args) {
    //Declare and initialise 3 boolean variables  
       boolean wantToGoToCinema = false;
       float money = 0.0f;
       boolean userGoesToCinema = false;
       
       final int LIMIT = 20; //Require 20 euro to go to cinema
       
       // Create a Scanner Object 
       Scanner in = new Scanner(System.in);
       
       //Program heading 
       System.out.println("Cinema Logic Program");
       System.out.println("---------------");
         
       //Get user input
       System.out.print("Do you wish to go to the cinema,"
               + " input true or false: ");
       wantToGoToCinema = Scanner. Boolean (true);
       
       System.out.print("How much money do you have: ");
       money= in.nextFloat(50);
        
        //Evaluate if user goes to cinema
       //we need both conditions to be true
       //i.e. want to go to cinema and have more than €20 
       userGoesToCinema = 
               (wantToGoToCinema) && (money > LIMIT);
                     
       //output if user goes to cinema 
       System.out.println("\nUser goes to Cinema: " +  userGoesToCinema);
    } //end of main method
} //end of class 
