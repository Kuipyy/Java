import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a,b;

        System.out.print("Üçgenin 1. kenar uzunluğunu giriniz: ");
        a = input.nextFloat();
        System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
        b = input.nextFloat();

        double aKare = Math.pow(a,2);
        double bKare = Math.pow(b,2);
        double hip = Math.sqrt(aKare+bKare);

        System.out.println("Verdiğiniz kenar uzunluklarına göre çizilen üçgenin hipotenüsü: " + hip);
    }
}
