import java.util.Scanner;

public class desenOlusturma {

    static void makePattern(int n) {
        if (n <= 0) {
            System.out.printf("%d ", n);
            return;
        }
        System.out.printf("%d ", n);
        makePattern(n - 5);

        System.out.printf("%d ", n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to make a pattern: ");
        int number = input.nextInt();

        makePattern(number);

    }
}
