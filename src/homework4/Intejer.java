package homework4;

/**
 * Created by IntelliJ IDEA.
 * User: Roza Mirzoyan
 * Date: 03/01/23
 */


public class Intejer {

    public static void main(String[] args) {
//    ******* First task *******

        int x = 6, y = 2;
        if ((x / y) * y == x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Task second

        int a = 2, b = 4, c = 7, d = 8, e = 44, f = 4;

        double k = (double) (a + b + c) / 3;
        System.out.println("k=" + k);

        double g = (double) (d + e + f) / 3;
        System.out.println("g=" + g);

        int u = (int) (k + g) / 2;
        System.out.println("u=" + u);

        // Third task
        double p = 5.2;
        float num = (float)(p-(int)p);
        System.out.println("num="+ num);

    }
}




