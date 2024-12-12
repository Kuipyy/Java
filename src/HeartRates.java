import java.util.Scanner;
public class HeartRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan alınan isim, soyisim, yaş bilgileri:
        String userName, userSurname, userInfo; //İsim ve soyisim değişkenleri ile bunları birleştirerek oluşacak (kullanım kolaylığı olması açısından)
        // kullanıcı bilgisi değikenleri, metin olarak burada tanımlandı
        System.out.println("İsminizi giriniz: "); //Kullanıcıdan isim bilgisi alındı
        userName = input.nextLine(); //Kullanıcının gireceği metin userName değişkenine atandı

        System.out.println("Soyisminizi giriniz: "); //Kullanıcıdan soyisim bilgisi alındı
        userSurname = input.nextLine(); //Kullanıcının gireceği metin userSurame değişkenine atandı

        userInfo = userName + " " + userSurname; //İsim ve soyisim birleşiminden kullanıcı bilgisi çıkartıldı ve tanımlaması yapıldı

        int userAge, maxHeartRate;
        System.out.println("Yaşınızı giriniz: "); //SİLİNECEK
        userAge = input.nextInt();

        //Maksimum kalp atış hızının belirlenmesi
        maxHeartRate = 220 - userAge;

        //Kalp atış hızı hedef aralıklarının belirlenmesi
        double lowerLimit, upperLimit, lowerTargetLimit, upperTargetLimit; //alt ve üst kalp atış hızı limitleri ile
        //hedef alt ve üst kalp atış hızı değişkenlerinin tanımlaması hassas ondalıklı olarak yapıldı

        lowerLimit = 0.50; //Alt hedef ağırlığının lowerLimit değişkenine ataması yapıldı
        upperLimit = 0.85; //Üst hedef ağırlığının upperLimit değişkenine ataması yapıldı
        lowerTargetLimit = maxHeartRate * lowerLimit; //Hedef kalp atış hızının alt limit hesaplaması yapıldı
        upperTargetLimit = maxHeartRate * upperLimit; //Hedef kalp atış hızının üst limit hesaplaması yapıldı

        System.out.println(userInfo + ", " + "girdiğiniz doğum tarihi bilgisine göre;");
        System.out.println("Kalp atış hızınız " + lowerTargetLimit + " ile " + upperTargetLimit + " değerleri arasında olmalıdır.");
    }
}
