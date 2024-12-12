import java.util.Scanner;

public class harmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        double result = 0;

        for (int i = 1; i <= number; i++) {
            result += Math.pow(i, -1);
        }
        System.out.printf("Harmonic number of %d is: %.2f", number, result);
    }
}

