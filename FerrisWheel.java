package com.mycompany.chapter5;

public class FerrisWheel {

    public static void main(String[] args) {
        //Figure out how fast you are actually
        //moving through the air
        //when you ride the London Eye 
        
        //Diameter or height of the London Eye
        double diameterInMetres = 135.0; 
        double minutesPerRotation = 30.0; 
        
        //distance of one full spin 
        //Circumference 
        double distancePerRotation = 
                Math.PI * diameterInMetres;
        
        //Calculate speed in km/h
        double speedMetresPerMinute = 
                distancePerRotation / minutesPerRotation;
        
        double speedKmPerHour 
                = (speedMetresPerMinute * 60) / 1000;
        
        System.out.printf("The wheel travels %.2f metres "
                + "in one full rotation. %n",distancePerRotation);
        
        System.out.printf("While enjoying the view, "
                + "you are moving at a relaxing "
                + "%.2f km/h! %n", speedKmPerHour);
        
        
    } //end main 
} //end class 
