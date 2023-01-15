package homework6;
import static java.lang.Math.*;


public class NegNumbers {
    public static void main(String[] args) {
        int[] arr = {-4, -15, -61, -22, 32};

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            } else {
                arr[i] = Math.abs(arr[i]);
                count1++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("chenged number count " + count1);
        System.out.println("Not chenged numbers " + count);
    }
}
