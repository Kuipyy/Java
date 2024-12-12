import java.util.Scanner;

public class etkinlikoneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını derece cinsinden giriniz: ");
        int temp = input.nextInt();

        String etkinlik = "";

        if (temp < 5) {
            etkinlik = "Kayak";
        } else if (temp < 15) {
            etkinlik = "Sinema";
        } else if (temp < 25) {
            etkinlik = "Piknik";
        } else if (temp > 35) {
            System.out.println("Hava sıcaklığı çok yüksek! Dışarı çıkmamanız önerilmekte.");
        } else {
            etkinlik = "Yüzme";
        }
        System.out.println(temp + "; " + etkinlik + " etkinliği için uygun bir sıcaklık.");
    }
}
