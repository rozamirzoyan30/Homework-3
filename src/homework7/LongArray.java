package homework7;

public class LongArray {
    public static void main(String[] args) {
        int[] x = {4, 8, 9, 6, 14, 55};
        int[] y = {88, 45, 4, 8};

        if (x.length >= y.length) {
            for (int i = 0; i < x.length; i++) {
                System.out.println("x is large array than y " + x[i]);
            }
        } else {
            for (int i = 0; i < y.length; i++) {
                System.out.println("y is large array than x " + y[i]);
            }
        }

    }
}