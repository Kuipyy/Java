import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelini almak istediğiniz tamsayıyı giriniz: ");
        int number = input.nextInt();

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.printf("Faktöriyel sonucu %d! = %d", number, result);
    }
}


