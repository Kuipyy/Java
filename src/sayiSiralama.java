import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tanımlamalar
        int num1;
        int num2;
        int num3;

        //Kullanıcıdan sayı girişi alma
        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        num3 = input.nextInt();

        //Sayı karşılaştırmaları
        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.println("Sıralama şu şekilde: " + num3 + " > " + num2 + " > " + num1);
            } else {
                System.out.println("Sıralama şu şekilde: " + num2 + " > " + num3 + " > " + num1);
            }
        } else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3) {
                System.out.println("Sıralama şu şekilde: " + num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.println("Sıralama şu şekilde: " + num1 + " > " + num3 + " > " + num2);
            }
        } else if ((num3 < num1) && (num3 < num2)) {
            if (num1 < num2) {
                System.out.println("Sıralama şu şekilde: " + num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println("Sıralama şu şekilde: " + num1 + " > " + num2 + " > " + num3);
            }
        }
    }
}
