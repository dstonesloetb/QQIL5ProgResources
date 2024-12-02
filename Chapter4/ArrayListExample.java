import java.util.ArrayList;

class ArrayListExample {
  public static void main(String[] args) {
    // Declare an ArrayList
    ArrayList<String> list = new ArrayList<String>();
        
    //populate the arraylist
    list.add("Alpha");
    list.add("Delta");
    list.add("Charlie");
    list.add("Yankee");
        
    System.out.println("List: "+list); //["Alpha","Delta"]
        
    //Display or get the second item list
    System.out.println(list.get(1));
        
    //Display the size of the arraylist
    System.out.println("Size: "+list.size());
        
    //Check does the list contain "Delta"
    boolean found = false;
        
    found = list.contains("Delta");
        
    System.out.println("Found Delta: "+found);
        
    //Change a "Charlie" in the list to "Bravo"
    list.set(2, "Bravo");
        
    //Remove first item ("Alpha") from the ArrayList 
    list.remove(0);
        
    //Use an enhanced for loop to output the ArrayList
    System.out.println("\nArrayList: ");
    for (String item : list)
    {
      System.out.println(item);
    }
        
  } //end main 
    
} //end class
