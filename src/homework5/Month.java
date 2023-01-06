package homework5;
import java.util.Scanner;

public class Month
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter valid month number (1-12): ");
     int month =scanner.nextInt();
     int days;
    switch (month) {
        case 1: days = 31;
        break;
        case 2: days = 28;
        break;
        case 3: days = 31;
        break;
        case 4: days = 30;
        break;
        case 5: days = 31;
        break;
        case 6: days = 30;
        break;
        case 7: days = 31;
        break;
        case 8: days = 31;
        break;
        case 9: days = 30;
        break;
        case 10: days = 31;
        break;
        case 11: days = 30;
        break;
        case 12: days = 31;
        break;
        default:
            System.out.println("You input was not correct");
            return;
    }
        System.out.println("The month is: " + month + " the day is : " + days);

}

}

