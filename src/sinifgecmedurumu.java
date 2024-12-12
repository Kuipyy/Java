import javax.swing.*;
import java.util.Scanner;

public class sinifgecmedurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aşağıdaki dersler için sırasıyla aldığınız puanları giriniz:");
        System.out.print("Matematik notunuz: ");
        double skorMat = input.nextDouble();

        System.out.print("Türkçe notunuz: ");
        double skorTur = input.nextDouble();

        System.out.print("Fizik notunuz: ");
        double skorFiz = input.nextDouble();

        System.out.print("Kimya notunuz: ");
        double skorKim = input.nextDouble();

        System.out.print("Müzik notunuz: ");
        double skorMuz = input.nextDouble();

        int sum = 0;
        sum += (skorMat > 0) ? 1 : 0;
        sum += (skorTur > 0) ? 1 : 0;
        sum += (skorFiz > 0) ? 1 : 0;
        sum += (skorKim > 0) ? 1 : 0;
        sum += (skorMuz > 0) ? 1 : 0;

        if (sum == 0) {
            System.out.println("Tüm derslerden 0 aldığınız için ortalamanız: 0");
        } else {
            double avg, total;
            total = skorMat + skorKim + skorFiz + skorTur + skorMuz;
            avg = total / sum;

            if (avg < 55) {
                System.out.println("Ortalamanız 55'in altında, sınıfı geçemediniz!");
            } else {
                System.out.println("Girdiğiniz notlara göre ortalamanız: " + avg + ", sınıfı geçtiniz!");
            }
        }
    }
}

