//Insert correct package name 



/**
 *
 * @author DarrenStones
 */
public class MyAreaLibrary {

    // This is a java class not a Java Main Class 
    // *** No main method in our library file  ***

    //Method to calculate the area of a rectangle 
    //Reference: 
    
    public static int areaRect(int width, int height) {
        
        // return width * height;
        
        int areaRectangle = width * height; 
        return areaRectangle;
        
    } //end areaRect

    //Method to calculate the area of a circle
    //Reference: 
    public static double areaCircle(int radius) {
     
        //area of a circle = Pi * Radius * Radius 
        double areaCircle = Math.PI * Math.pow(radius,2);
        //double areaCircle = Math.PI * radius * radius;
        
        return areaCircle;
    } //end areaCircle 
    
}  //end class 