package homework7;

public class TwoArray {
    public static void main(String[] args) {

        int[][] firstArray = {
                {8, 24, 45, 77, 12},
                {5, 14, 88, 97, 55},
                {4, 5, 89, 10, 75}};


        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("first Array " + firstArray[i][0] + " last Array " + firstArray[i][firstArray[0].length - 1]);
        }
    }
}
