package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir double, bir tamsayi alin,
        // double sayiyi tam sayiya bolun
        //ve bolum isleminin sonucunun tamsayi kismini yaazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz");
        double sayiDbl= scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayiInt= scan.nextInt();

        System.out.println(sayiDbl/sayiInt); // sonucu double olarak yazdirir


    }
}
