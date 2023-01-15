package homework6;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char[] array = {'n', 'k', 'l', 'a', 'G', 'K'};
        char letter = 'n';
        int i = 0;
        while (i < array.length) {
            if (array[i] == letter) {
                break;
            }
            i++;
        }
        if (i == array.length) {
            System.out.println("Letter " + letter + "not found");
        } else {
            System.out.println("Letter " + letter + " letter found in position " + i);
        }
    }
}