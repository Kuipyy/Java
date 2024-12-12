
import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2'nin hangi kuvvetlerinin alınmasını istiyorsunuz: ");
        int power = input.nextInt();

        double sum = 0;

        for (int i = 0; i <= power; i++) {
            double result = Math.pow(2, i);
            sum += result;
            System.out.printf("2 ^ %d = %.0f\n", i, result);
        }
        System.out.printf("Toplam = %.0f", sum);
    }
}
