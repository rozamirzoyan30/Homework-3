package clocknumber;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        double[] array1 = new double[] {-2.2,-9.6,7,-8.4,9};
        double[] array2= new double[5];

           for (int i = 0;i < array1.length;i ++){
           if  (array1[i] > 0){
               array2[i]=array1[i];
           }
            System.out.println(array2[i]);
        }
    }
}
