/* Using Math.PI to calculare area of a circle */

public class Pi {


    public static void main(String[] args) {

        float radius = 5.0f; 
        float shortPi = (float) Math.PI;
        
        //Perform maths calculations
        //Circumference of circle = Pi * 2r
        float circ = shortPi * (radius+radius);
        //Area of circle = Pi * r * r
        float area = shortPi * (radius * radius);
        
        //Output
        System.out.println("With Pi commuted from "+Math.PI);
        System.out.println(" to "+shortPi+"...");
        System.out.println("A circle of radius "+radius+ " cm");
        System.out.println("has a circumference of "+circ+" cm");
        System.out.println(" and an area of "+ area + " sq.cm");

        
    } //end main 
    
} //end class
