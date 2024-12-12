
import java.util.Scanner;
public class notortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, muz, tar, tur;
        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kim = input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muz = input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tar = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        tur = input.nextInt();

        double ort = (mat + fiz + kim + muz + tar + tur)/6.0;
        String sonuc = (ort > 60) ? "Sınıfı geçtiniz, notunuz: " + ort : "Sınıfta kaldınız, notunuz: " + ort;
        System.out.println(sonuc);
        //System.out.println("Not ortalamanız şu şekildedir: " + ort);
    }
}
