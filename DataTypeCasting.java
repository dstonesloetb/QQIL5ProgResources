public class DataTypeCasting {

    public static void main(String[] args) {
        // Widening or upcasting
        // Automatic casting: int to double
        // Going from a smaller data type to a larger
        // data type
        int myInt = 9;
        double myDouble = myInt; //myDouble =9.0 

        // Outputs 9
        System.out.println(myInt);  
        // Outputs 9.0
        System.out.println(myDouble);   
    
        //Example 2
        //Downcasting or narrowing
        //Going from a larger data type to 
        //a smaller data type
        double myDouble2 = 9.78d;
        // Manual casting: double to int
        int myInt2 = (int) myDouble2; 
        //double myInt2 = myDouble2; //promotion 

         // Outputs 9.78
        System.out.println(myDouble2); 
        // Outputs 9
        System.out.println(myInt2);      
        
        //Page 63 Chapter 4 Java Book
        float daysFloat = 365.25f;
        String weeksString  = "52"; 
        
        //Cast the float into an int variable
        //  365.25 ->  365
        int daysInt = (int) daysFloat; 
        
        //Convert the String into an int
        //  "52" - >  52  an integer 
        int weeksInt = Integer.parseInt(weeksString);
        
        //Calculate the number of days in a week
        int week = (daysInt / weeksInt);
        
        //Output the result
        System.out.println("Days per week: "+week);
        
    }
    
    
}
