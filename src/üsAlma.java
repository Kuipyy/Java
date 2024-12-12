import java.util.Scanner;

public class üsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban;
        int us;
        int result = 1;

        System.out.println("Üssünü almak istediğiniz sayı: ");
        taban = input.nextInt();

        System.out.println("Kaçıncı üssü alınacak: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        System.out.printf("%d'%d işleminin sonucu: %d", taban, us, result);
    }
}


