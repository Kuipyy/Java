import java.util.Locale;
import java.util.Scanner;

public class kitleindeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

         double boy, kilo, indeks ;
        System.out.print("Boy ölçünüzü metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilo bilginizi kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Girdiğiniz bilgilere göre vücut kitle indeksiniz: " + indeks);

    }

}
