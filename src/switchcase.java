import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Haftanın günlerinden sayı olarak giriş yapınız: ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                //yaptırılmak istenen başka operasyonlar da eklenebilir, doğru olduğu her koşulda buradaki işlemleri sırasıyla yaptıracak
                break; // bu komut verilmezse sistem durmaz ve aşağıdaki case çıktılarını da yazdırmaya devam eder.
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
