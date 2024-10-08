import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int ilkSayi = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int ikinciSayi = input.nextInt();

        System.out.print("Hangi operatörle işlem yapmak istiyorsunuz(toplam:1, çıkarma:2, bölme:3, çarpma:4)? ");
        int oprtr = input.nextInt();

        String oprtrString = "";
        double result = 0;

        switch (oprtr) {
            case 1:
                oprtrString = "+";
                result = ilkSayi + ikinciSayi;
                System.out.print(ilkSayi + " " + oprtrString + " " + ikinciSayi + " = " + result);
                break;
            case 2:
                oprtrString = "-";
                result = ilkSayi - ikinciSayi;
                System.out.print(ilkSayi + " " + oprtrString + " " + ikinciSayi + " = " + result);
                break;
            case 3:
                oprtrString = "/";
                result = ilkSayi / ikinciSayi;
                System.out.print(ilkSayi + " " + oprtrString + " " + ikinciSayi + " = " + result);
                break;
            case 4:
                oprtrString = "*";
                result = ilkSayi * ikinciSayi;
                System.out.print(ilkSayi + " " + oprtrString + " " + ikinciSayi + " = " + result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");

        }
    }
}
