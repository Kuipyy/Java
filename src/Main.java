import java.util.Scanner; //kullanıcıdan değer almak için kütüphaneden eklenmelidir

public class Main { //main başlığı altında class açıldı
    public static void main(String[] args) { //main metodu açıldı
        /*System.out.println("Merhaba Neslihan");
        System.out.println("Hoşgeldin");*/ //sistemden dışarıya bir şey çıkarılacağı için out kullanıldı
        // veya direkt böyle yazılabilir: System.out.println("merhaba neslihan \n hoşgeldin");

        // JAVA DEĞİŞKEN TİPLERİ
         //<veri tipi> <değişken ismi> = veri(değer)
        /*int numberOne = 10;
        numberOne = 15;  // değişkenin değeri değiştirileceği zaman tekrardan değişken cinsini tanımlaması yapılmamalıdır
        System.out.println(numberOne); */

        /*int numberTwo, numberThree; //aynı anda tanımlama yapılıp sonradan değer ataması yapılabilir
        numberTwo = 20;
        numberThree = 30;
        int numberFour = numberOne + numberTwo;
        System.out.println(numberThree);
        System.out.println(numberFour); */

        /*int kisaKenar, uzunKenar, cevre, alan; //daha sonrasında kullanılmayan değişkenin rengini soluk yapar
        kisaKenar = 10;
        uzunKenar = 15;
        cevre = 2 * (kisaKenar + uzunKenar);
        alan = kisaKenar * uzunKenar;
        System.out.println(alan); */

        /*float vFloat = 3.14f;
        System.out.println(vFloat); */

        /*char vChar = 'b';
        char v2Char = 98; // karakterin ASCII karşılığı direkt yazıldığında da kendisini döndürecektir
        System.out.println(vChar);
        System.out.println(v2Char); */

        /*boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru); */

        /*String vStr = "neslihan";
        System.out.println(vStr);*/

        //TEMEL OPERATÖRLER
        /*int a = 4, b = 3;
        b += a;
        System.out.println(b); */

        /*boolean sonuc = 1==5;
        System.out.println(sonuc); */

        /*int a = 2, b = 3, c = 2;
        boolean kosul1 = a==c;
        boolean kosul2 = a>=b;
        boolean sonuc = kosul1 && kosul2;
        String str = a==c ? "doğru" : "yanlış"; //koşul sorgulaması yapar
        System.out.println(sonuc);
        System.out.println(str); */

        //KULLANICIDAN VERİ ALMA
        Scanner input = new Scanner(System.in); //bu inputu kullanabilmek için yazılmalıdır
        int a;
        System.out.print("A sayısını giriniz: ");
        a = input.nextInt(); //next ifadesi input yani giriş için bekleme yapılan yere bir sonraki hamlede ne yazılacaksa onu hedeflemek anlamına gelir
        System.out.println(a);

    } //main metodu kapatıldı
} //main classı kapatıldı


