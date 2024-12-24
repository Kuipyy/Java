import java.util.Scanner;

public class hesapmakinesi {

    static double toplam(double a, double b) {
        return a + b;
    }

    static double cikarma(double a, double b) {
        return a - b;
    }

    static double bolme(double a, double b) {
        return a / b;
    }

    static double carpma(double a, double b) {
        return a * b;
    }

    static double mod(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İşlemler double tipiyle yapılacaktır, sayıları bu formatta giriniz!");
        System.out.print("1. sayıyı giriniz: ");
        double ilkSayi = input.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        double ikinciSayi = input.nextDouble();

        System.out.print("Hangi operatörle işlem yapmak istiyorsunuz(toplam:1, çıkarma:2, bölme:3, çarpma:4, mod alma:5 )? ");
        int oprtr = input.nextInt();

        String oprtrString = "";
        double result;

        switch (oprtr) {
            case 1:
                oprtrString = "+";
                result = toplam(ilkSayi, ikinciSayi);
                System.out.printf("%.2f %s %.2f : %.2f", ilkSayi, oprtrString, ikinciSayi, result);
                break;
            case 2:
                oprtrString = "-";
                result = cikarma(ilkSayi, ikinciSayi);
                System.out.printf("%.2f %s %.2f : %.2f", ilkSayi, oprtrString, ikinciSayi, result);
                break;
            case 3:
                oprtrString = "/";
                if (ikinciSayi == 0) {
                    System.out.println("0'a böldürme hatası!");
                } else {
                    result = bolme(ikinciSayi, ikinciSayi);
                    System.out.printf("%.2f %s %.2f : %.2f", ilkSayi, oprtrString, ikinciSayi, result);
                }
                break;
            case 4:
                oprtrString = "*";
                result = carpma(ilkSayi, ikinciSayi);
                System.out.printf("%.2f %s %.2f : %.2f", ilkSayi, oprtrString, ikinciSayi, result);
                break;
            case 5:
                oprtrString = "%";
                result = mod(ilkSayi, ikinciSayi);
                System.out.printf("%.2f %s %.2f : %.2f", ilkSayi, oprtrString, ikinciSayi, result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
