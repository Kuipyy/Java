import java.util.Scanner;

public class ucakbilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tanımlamalar & Kullanıcı Girişleri & Hatalı Giriş Uyarıları
        double mesafe;
        int yas;
        int yolculukTip;
        double mesafeBasiUcret = 0.1;

        System.out.print("Katedilecek mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        if (mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz.");
        } else {

            System.out.print("Yaşınızı giriniz: ");
            yas = input.nextInt();
            if (yas <= 0) {
                System.out.println("Hatalı veri girdiniz.");
            } else {

                System.out.println("Tek Yön: 1\nGidiş-dönüş: 2");
                System.out.print("Yolculuk tipinizi giriniz: ");
                yolculukTip = input.nextInt();
                if (((yolculukTip != 1) && (yolculukTip != 2))) {
                    System.out.println("Hatalı veri girdiniz.");
                } else {

                    double toplamTutar = mesafe * mesafeBasiUcret;

                    //Yaşa Göre Uygulanan İndirimler
                    if (yas < 12) {
                        toplamTutar = toplamTutar / 2;
                    } else if (yas < 24) {
                        toplamTutar = toplamTutar * 0.9;
                    } else if (yas > 65) {
                        toplamTutar = toplamTutar * 0.7;
                    } else {
                        toplamTutar = toplamTutar * 1;
                    }

                    //Yöne Göre Uygulanan İndirim
                    if (yolculukTip == 2) {
                        toplamTutar = toplamTutar * 0.8;
                    } else {
                        toplamTutar = toplamTutar * 1;
                    }

                    System.out.println("Verdiğiniz tüm bilgilere göre bilet tutarınız: " + toplamTutar);
                }
            }
        }
    }
}
