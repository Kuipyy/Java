import java.util.Scanner;

public class armstrongSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Armstrong sayı olup olmadığının kontrolü için pozitif bir sayı girin: ");
        int number = input.nextInt();
        int numberFirst = number;
        int numberSecond = number;

        // Negatif sayılar ve 0 için kontrol
        if (number <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
            return; // Programı sonlandırıyoruz
        }

        int digitNumber = 0;
        double sum;
        double result = 0;

        // Basamak sayısını bulma
        while (numberFirst != 0) {
            numberFirst /= 10;
            digitNumber++;
        }

        int exponent = digitNumber;

        // Her basamağın üs alınarak toplanması
        while (numberSecond != 0) {
            int digit = numberSecond % 10;
            numberSecond /= 10;
            sum = Math.pow(digit, exponent);
            result += sum;
        }

        // Armstrong sayısı kontrolü
        if (number == result) {
            System.out.printf("%d sayısı, bir Armstrong sayıdır.%n", number);
        } else {
            System.out.printf("%d sayısı, bir Armstrong sayı değildir.%n", number);
        }
    }
}
