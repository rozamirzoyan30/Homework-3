package homework8;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] prime = {1, 11, 13, 8};
        boolean prime1 = false;
        for (int i = 0; i < prime.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < prime[i]; j++) {
                if (prime[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime1 = true;
                System.out.println(prime[i] + " are the prime numbers in the array ");
            }
        }
        if (!prime1)
            System.out.print("This numbers are not prime ");
    }
}