package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5); // 5.6 ama java 5 yazdirir

        System.out.println(29/3);// 9.666666 ama  java 6 olarak yazar

        // Java bir bolme isleminde 2 int isleme giriyorsa sonucu int olarak verir

        int sayi1= 25;
        int sayi2 = 6;

        System.out.println(sayi1/sayi2);  // 4         (4.16 ama sonuc 4 vercek)

        double dbl=6; // 4.166666666667

        System.out.println(sayi1/dbl); // 6.25

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birbrine bolmek icin tam sayi giriniz");

        int ilkSayi= scan.nextInt();
        int ikinciSayi= scan.nextInt();

        System.out.println("Iki sayinin bolme sonucu  : "  + (double)ilkSayi/ikinciSayi);
                    //double parantez ekleyince
                    //sonuc ondalikli cikti. parantezler yokken tam sayi kismini veriyordu



    }
}
