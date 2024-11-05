/* There are 3 rounding functions in the Math Class
   Math.round(), Math.floor() and Math.ceil()
   as demonstrated below.
*/

public class Round {

  
    public static void main(String[] args) {
     
        float num = 7.25f;
        
        //Output the rounded float value
        //as an int value 
        System.out.println(num + " rounded is "+
                Math.round(num)); //7.25-> 7 (int)
        
        //Output the rounded float value
        //as double values
        System.out.println(num + " floored is "+
            Math.floor(num)); //7.25-> 7.0 (double)
        
        
        System.out.println(num + " ceiling is "+
            Math.ceil(num)); //7.25-> 8.0 (double)
        
        
    } //end main
    
} //end class
