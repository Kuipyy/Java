import java.util.Scanner;

public class ciftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Çİft tam sayı girişi yapınız: ");
        int sayi = input.nextInt();

        if (sayi % 2 != 0) {
            sayi -= 1;
        }

        for (int i = 0; i <= sayi; i += 2) {
            System.out.printf("%d\n", i);
        }
    }
}
