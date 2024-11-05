/* Generate a random number between 1 and 10 */

public class Random {


    public static void main(String[] args) {
       //Generate a random number in the
       //range 0.0 to 0.999 (double)
       float random = (float) Math.random();
       System.out.println("Random number: "+random);
        
       //Multiply the random number by 10
       //provide a random number in the range
       //0.0 to 9.999
       float multiplied = random *10;
       System.out.println("Multiplied number: "+multiplied);
       
       //Round the multiplied number up
       //provide a random number 1-10 (int)
       int randomInt = (int) Math.ceil(multiplied);
       System.out.println("Random integer: "+randomInt);
       
    } //end main 
    
} //end class 
