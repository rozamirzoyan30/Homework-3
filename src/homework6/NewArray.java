package homework6;

public class NewArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 28, 9};
        int[] arr2 = {15, 20, 6, 18};
        int[] arr3 = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = 0;
            }
            System.out.println("arr3= " + arr3[i]);
        }
    }
}