import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tanımlama
        int dogumYil;

        //Kullanıcıdan bilgi alma
        System.out.print("Doğum yılınızı giriniz: ");
        dogumYil = input.nextInt();

        //Tanımlama
        int zodyak = dogumYil % 12;
        String hayvan = "";

        //Atamalar
        switch (zodyak) {
            case 0:
                hayvan = "Maymun";
                break;
            case 1:
                hayvan = "Horoz";
                break;
            case 2:
                hayvan = "Köpek";
                break;
            case 3:
                hayvan = "Domuz";
                break;
            case 4:
                hayvan = "Fare";
                break;
            case 5:
                hayvan = "Öküz";
                break;
            case 6:
                hayvan = "Kaplan";
                break;
            case 7:
                hayvan = "Tavşan";
                break;
            case 8:
                hayvan = "Ejderha";
                break;
            case 9:
                hayvan = "Yılan";
                break;
            case 10:
                hayvan = "At";
                break;
            case 11:
                hayvan = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }

        //Çıktıyı ekrana yazdırma
        System.out.println("Doğum yılınıza göre Çin Zodyağı burcunuz: " + hayvan);
    }
}
