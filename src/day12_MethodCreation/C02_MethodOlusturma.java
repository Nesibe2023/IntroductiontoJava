package day12_MethodCreation;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // verilen iki sayiyi carpip sonucu yazdiran bir method olusturun

        // bir method ancak method call yapildiginda calisir

        // method call icin method adi ve parametrelere uygun argument yazilmalidir

        // method call icersinde yazilan variable veya degerlere argument denir

        // carpYazdir("ALI", "VELI");  Argument ve parametreler uyumlu degilse CTE olur

        carpYazdir(5,8);
        carpYazdir(7.4, 8.6);

    }

    public static void carpYazdir(double sayi1, double sayi2) {

        System.out.println(sayi1*sayi2);
    }


}
