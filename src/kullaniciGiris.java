import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "github";
        int correctPassword = 12345;
        boolean isUsernameCorrect = false;


        while (!isUsernameCorrect) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            String username = input.nextLine();
            if (username.equals(correctUsername)) {
                System.out.println("Kullanıcı adınız doğru.");
                isUsernameCorrect = true;
            } else {
                System.out.println("Kullanıcı adınızı yanlış girdiniz!");
            }
        }
        System.out.print("Şifrenizi giriniz: ");
        int password = input.nextInt();
        if (password == correctPassword) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Şifrenizi sıfırlamak ister misiniz (evet:1, hayır:0)? ");
            int response = input.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz: ");
                    int newPassword = input.nextInt();
                    if (newPassword == password) {
                        System.out.println("Şifre oluşturulamadı, lütfen farklı şifre giriniz.");
                    } else {
                        System.out.println("Şifre başarıyla değiştirildi.");
                    }
                    break;

                case 2:
                    System.out.println("Şifrenizi değiştirmediniz, giriş yapılamayacaktır.");
                    break;

                default:
                    System.out.println("Seçim yapmadınız, sistem kapatıldı.");
            }
        }

    }
}


