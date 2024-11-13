import java.util.Scanner;

public class tekSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz (Negatif sayı girildiğinde sistem duracaktır): ");
        int sayi = input.nextInt();

        int toplam = 0;

        while (sayi >= 0) {
            if (sayi % 2 != 0) {
                toplam += sayi;
                System.out.print("Sayı giriniz: ");
                sayi = input.nextInt();
            } else {
                System.out.print("Sayı giriniz: ");
                sayi = input.nextInt();
            }
        }
        System.out.printf("Negatif sayı girdiniz! Şu ana kadar girdiğiniz tek sayıların toplamı: %d", toplam);
    }
}
