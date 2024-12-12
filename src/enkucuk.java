import java.util.Scanner;

public class enkucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı girişi yapınız: ");
        int a = input.nextInt();

        System.out.print("2. tam sayı girişini yapınız: ");
        int b = input.nextInt();

        System.out.print("3. tam sayı girişini yapınız: ");
        int c = input.nextInt();

        int sonuc = 0; //başlangıç değeri verildi

        if ((a < b) && (a < c)) {
            sonuc = a;
        } else if ((b < c) && (b < c)) {
            sonuc = b;
        } else if ((c < b) && (c < a)) {
            sonuc = c;
        }
        System.out.println("Girdğiniz sayılardan en küçük olan: " + sonuc);
    }

}
