
package homework8;

public class Decimal{
    public static void main(String[] args) {
         int [] dec = {1,0,0,1,0};
         int decimal  =0;
         for (int i=0; i<dec.length; i++){
            if (dec[dec.length-i-1] != 0){
                decimal += Math.pow(2, i)* dec[dec.length-i-1];
            }
         }
        System.out.println("Decimal number is  = " + decimal);
    }

}

