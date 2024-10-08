import java.util.Scanner;


class HouseAlarm {
  public static void main(String[] args) {
    //Declare and initialise 3 boolean variables  
       boolean dayTime = false;     // P 
       boolean windowOpen = false;  // Q 
       boolean burglaryInProgress = false; //R
       
       // Create a Scanner Object 
       Scanner in = new Scanner(System.in);
           
       //Output a heading for program 
       System.out.println("Boolean Burglary Program");
       System.out.println("-------------------------");
             
       //Request input from the user        
       System.out.print("Is it day time?,"
               + " please enter true or false: ");
       
       dayTime = in.nextBoolean();
                        
       System.out.print("Is the window open?, "
               + "please enter true or false: ");
       
       windowOpen= in.nextBoolean();
        
       //Evaluate if a burglary is in progress
       //we need both conditions to be true
       //i.e. nighttime and window is open 
       burglaryInProgress = (!dayTime) && windowOpen;
       
         
       //output if there is a robbery in progress 
       System.out.println("\nBulgarly In Progress: "
               +  burglaryInProgress);
        
  }
}
