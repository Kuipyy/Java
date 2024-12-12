import java.util.Scanner;
public class KDVTutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KDVTutar, yeniTutar, mevcutTutar;
        KDVTutar = 0.18;
        System.out.println("Ödediğiniz fiyat tutarını giriniz: ");
        mevcutTutar = input.nextDouble();
        yeniTutar = mevcutTutar * 1.18;
        KDVTutar = yeniTutar - mevcutTutar;
        System.out.println("KDV Tutarı : " + KDVTutar);
        System.out.println("Toplam Tutar : " + yeniTutar);
    }
}
