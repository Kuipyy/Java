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
        /*int a;
        System.out.print("A sayısını giriniz: ");
        a = input.nextInt(); //next ifadesi input yani giriş için bekleme yapılan yere bir sonraki hamlede ne yazılacaksa onu hedeflemek anlamına gelir
        System.out.println(a); */

        //Mantıksal Operatörler
        /*int a = 5;
        int b = 10;
        System.out.println(a < b);
        System.out.println(a != b); */

        /*int a = 10, b = 20, c = 5, d;

        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean sonuc = kosul1 && kosul2;
        d = (a == b) ? 15 : 25;

        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(d); */

        //int a = 5, b = 10, c = 3;
        /*String comparison = (a == b) ? "eşittir" : "eşit değildir";
        System.out.println(comparison); */

       /* if (a == b) {
            System.out.println("eşittir");
        } else {
            System.out.println("eşit değildir");
        } */

        //System.out.printf("%s%n%s%n","Welcome to", "Java Programming!");

       /* int i = 1;
        while (i <= 5) {
            System.out.printf("%d ",i);
            i++;
        } */

        /*
        int left = 100;
        int right = 200;
        while (++left < --right) {
        }
        System.out.println(left); */

       /* int sayi;
        for (sayi =1; sayi<=10; sayi++) {
            System.out.printf("%d,", sayi);
        }*/

    } //main metodu kapatıldı
} //main classı kapatıldı


