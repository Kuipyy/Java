import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kmUcret = 2.20f;
        int acilisUcret = 10;
        int minUcret = 20;
        float mesafe;

        System.out.print("Mesafe miktarını km cinsinden giriniz: ");
        mesafe = input.nextFloat();

        float toplamUcret = acilisUcret + (kmUcret * mesafe);

        String aciklama = (toplamUcret < minUcret) ? "Toplam tutar: " + minUcret + " TL" : "Toplam tutar: " + toplamUcret + " TL";
        System.out.println(aciklama);
    }
}
