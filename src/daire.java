
import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yaricap, cevre, alan, pi;
        System.out.print("Dairenin yarıçap bilgisini giriniz: ");
        yaricap = input.nextDouble();

        pi = 3.14;
        cevre = 2 * yaricap * pi;
        alan = pi * yaricap * yaricap;

        System.out.println("Girdiğiniz yarıçap değerine göre çizilecek dairenin çevresi: " + cevre);
        System.out.println("Girdiğiniz yarıçap değerine göre çizilecek dairenin alanı: " + alan);
    }
}
