
import java.util.Scanner;

public class recursiveisPrime {
    int divisor = 2;

    static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a prime number: ");
        int number = input.nextInt();

        boolean result = isPrime(number, 2);

        if (result) {
            System.out.printf("%d is a prime number", number);
        } else {
            System.out.printf("%d is not a prime number", number);
        }

    }
}

