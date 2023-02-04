package day13_MethodOverloading_whileLoop;

import java.util.Locale;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5));   // cok guzel
        System.out.println(str.substring(3,5));   // a

        // Eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ve ayni isimdeki method`lardan hangisinin calisacagina argument/parametre uyumu karar  verir

        toplama(5 , 6);  // 11
        toplama(4 , 5 , 6);  // 15
        toplama(3, 2.4); // 5,4
        toplama(2.4 , 3);  // 5,4
        toplama(2.0 , 3.3 );  // 5,3    burda ondalik yapmak icin (.) kullaniyo. normalde(,)


        /*
        Java ayni class icerisinde ayni isim
        ve ayni data turunden parametre sayisi ile 2 method olusturmaniza izin vermez

        1-ismini degistirebiliriz, ancak bu durumda overloading olmaz
          overloading ayni isimde ama farkli isleme sahip methodlar olusturmak demektir

        2-parametre sayisini degistirebiliriz

        3-ayni sayida parametre yazip, parametrelerin data turunu degistirebiliriz

         */

    }

    public static void toplama(int sayi1, int sayi2) {System.out.println("2  sayinin toplami : " + (sayi1 + sayi2));}

    public static void toplama(int sayi1, int sayi2, int sayi3) {System.out.println("2 sayinin toplami : " + (sayi1 + sayi2+sayi3));}

    public static void toplama(double sayi1, int sayi2){System.out.println("2 sayinin toplami : " + (sayi1 + sayi2));}

    public static void toplama(int sayi1, double sayi2) {System.out.println("2  sayinin toplami : " + (sayi1 + sayi2));}

    public static void toplama(double sayi1, double sayi2) {System.out.println("2 sayinin toplami : " + (sayi1 + sayi2));}
}
