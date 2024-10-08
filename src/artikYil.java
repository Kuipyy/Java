import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yilBilgisi;
        System.out.print("Yıl giriniz: ");
        yilBilgisi = input.nextInt();

        if (yilBilgisi % 4 == 0) {
            if (yilBilgisi % 100 == 0) {
                if (yilBilgisi % 400 == 0) {
                    System.out.println(yilBilgisi + "; artık yıldır.");
                } else {
                    System.out.println(yilBilgisi + "; artık yıl değildir.");
                }

            } else {
                System.out.println(yilBilgisi + "; artık yıldır.");
            }
        } else {
            System.out.println(yilBilgisi + "; artık yıl değildir.");
        }
    }
}

