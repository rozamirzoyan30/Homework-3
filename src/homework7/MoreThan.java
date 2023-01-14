package homework7;

public class MoreThan {
    public static void main(String[] args) {
        int[] x = {4, 8, 9, 2, 7};
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[i - 1]) {
                count++;

            }
        }
        System.out.println(count);


    }
}