package clocknumber;
import java.util.Scanner;


public class ClockNumber {
    public static void main(String[] args) {
                              /*     ***  First version***
      *   The program will accept the number of the minute and print how many minutes in that section. */

       Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Please enter numbers between 1-12");
        }
        int minute =scanner.nextInt();
        int section;
           switch (minute) {
            case 1: section = 5;
                break;
            case 2: section = 10;
                break;
            case 3: section = 15;
                break;
            case 4: section = 20;
                break;
            case 5: section = 25;
                break;
            case 6: section = 30;
                break;
            case 7: section = 35;
                break;
            case 8: section = 40;
                break;
            case 9: section= 45;
                break;
            case 10: section = 50;
                break;
            case 11: section= 55;
                break;
            case 12: section= 60;
                break;
            default:
                System.out.println("You entered wasn't correct number for the section of the clock.");
                return;
        }
        System.out.println("The minute is : " + section);

    }
}


                    /*        ***      Second version ***


public class ClockNumber {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                {
                    System.out.println("Please enter numbers between 1-12");
                }  int x =scanner.nextInt();

        if (x > 0 && x < 13){
            System.out.println( x * 5);
        } else{
            System.out.println("You entered wrong number");
        }
     }
   }      */

