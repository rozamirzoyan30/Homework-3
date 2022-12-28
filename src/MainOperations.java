/**
 * Created by IntelliJ IDEA.
 * User: Roza Mirzoyan
 * Date: 26/12/22
 */

public class MainOperations {

    public static void main(String[] args) {

        //    ******* First task c = a * a + b * b ********

        int c;
        int a = 1;
        int b = 5;
        c = a * a + b * b;

        System.out.println("c = " + c);

        //  ***** Second task " Find the surface area of the table" *****

        a = 5;
        b = 7;
        c = 4;
        int s = ((a + b) / 2) * c;

        System.out.println("s = " + s);

        //  ******** Third task *****

        int p = 548;
        System.out.println("First number is: " +p/100);
        System.out.println("Second number is: " + (p/10)%10);
        System.out.println("Third number is: " + p%10);
    }
}