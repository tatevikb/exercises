import java.util.Scanner;

public class PrimeNumber {
    /**
     * The first version of prime number check.
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        int sqrt = (int)Math.sqrt(n) + 1;
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * The second version of prime number check.
     * @param n
     * @return
     */
    public static boolean isPrimeNumber(int n) {
        if(n == 0 || n == 1) {
            return false;
        }

        if(n == 2 || n == 3) {
            return true;
        }
        if(n%2 == 0) {
            return false;
        }
        int sqrt = (int)Math.sqrt(n) + 1;
        for(int i = 3; i < sqrt; i += 2) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * The third version of prime number check.
     * @param n
     * @return
     */
    public static String isPrimeOrNot(int n) {
       if(n < 0) {
           return "Number is not valid";
       }
       if(n == 0 || n == 1) {
           return  "Number is not prime";
       }
       if(n == 2 || n == 3) {
           return "Number is prime";
       }
       if((n * n - 1) % 24 == 0) {
           return "Number is prime";
       }
        return "Number is not prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrimeNumber(n));
        System.out.println(isPrimeOrNot(n));
    }
}
