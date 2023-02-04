package day13_MethodOverloading_whileLoop;

import day12_MethodCreation.C03_AsalSayi;
import day12_MethodCreation.C07_TerseCevirme;
import day12_MethodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);

        // Asagida verilen cumleyi ters CEVIRIN

        String str="Bir kere yaparim, yan gelir yatarim" ;
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));

        // Asagida verilen cumleyi ters YAZDIRIN

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

        // Polindrome olup olmadigini yazdirin

        str="Java Candir" ;
        tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)) {
            System.out.println();
        }else {
            System.out.println("Palndrome degil");
        }

        // sayinin asal olup olmadigini yazdirin

        int sayi=23;

        System.out.println(C03_AsalSayi.asalSayiMi(sayi));

        // kullanici true/ false dan bir sey anlamaz, acik sekilde yazalim dersek

        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi) ; // true

        if (sonuc){
            System.out.println("Girilen  " + sayi + " asal sayi.");
        }else {
            System.out.println("Girilen  " + sayi + " asal sayi degil.");
        }









    }
}
