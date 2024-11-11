//Insert correct package name

public class CalculateAreas {

    public static void main(String[] args) {
        // Calculate the area of rectangle 1
        int width = 100;
        int height = 200;
        //int area = 100 * 200;
        //int area = width * height;
        //int area = MyAreaLibrary.areaRect(100,200);
        int areaR1 = MyAreaLibrary.areaRect(width, height);
        System.out.println("Area of rectangle 1: "+areaR1);
        
        // Calculate the area of rectangle 2
        width = 50;
        height = 150;
        
        int areaR2 = MyAreaLibrary.areaRect(width, height);
        System.out.println("Area of rectangle 2: "+areaR2);
        
        //Calculate the area of Circle 1
        int radius = 5;
        
        double areaCircle1 = MyAreaLibrary.areaCircle(radius);
        
        System.out.println("\n");
        System.out.println("Radius of circle 1: "+radius);
        System.out.println("Area of circle 1: "+areaCircle1);
        
        
        //Calculate the area of Circle 2
        radius = 15;
        
        double areaCircle2 = MyAreaLibrary.areaCircle(radius);
        
        System.out.println("\n");
        System.out.println("Radius of circle 2: "+radius);
        System.out.println("Area of circle 2: "+areaCircle2);
        
        
    } //end main 
    
} //end class
