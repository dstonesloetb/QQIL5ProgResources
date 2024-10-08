//Insert the package name at the top of the class 

//We tried testing for cases 0, 8, 1.5
//We tried changing the data type for day from an int to a float 

public class SwitchOnDay {
  public static void main(String[] args) {
    int day = 1;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}
