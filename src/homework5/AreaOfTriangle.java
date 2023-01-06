package homework5;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Triangle created");
        } else {
            System.out.println("Triangle not created");
        }

    }
}
