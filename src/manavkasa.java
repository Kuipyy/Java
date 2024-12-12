import java.util.Locale;
import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double armut, elma, domates, muz, patlican, toplam;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 1.21;
        patlican = 5.0;

        System.out.print("Armut kaç kilo alındı? ");
        armutKilo = input.nextInt();
        System.out.print("Elma kaç kilo alındı? ");
        elmaKilo = input.nextInt();
        System.out.print("Domates kaç kilo alındı? ");
        domatesKilo = input.nextInt();
        System.out.print("Muz kaç kilo alındı? ");
        muzKilo = input.nextInt();
        System.out.print("Patlıcan kaç kilo alındı? ");
        patlicanKilo = input.nextInt();

        toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam tutar = " + toplam);
    }
}
