class MyStringOpsExample {

    static String displayTrimmedString(String txt) {
        
        txt = txt.trim();
        System.out.println("String: "+txt);
        System.out.println("Trimmed String length "
                + ""+txt.length());
        
        return txt; 
        
    } //end method
    
    
    
} //end class
