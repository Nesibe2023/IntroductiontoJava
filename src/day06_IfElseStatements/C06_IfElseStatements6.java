package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements6 {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin;
        // kadin 60 yas ve uzeri, erkek 65 yas ve uzeri emekli olabilir
        // cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        // veya Ëmekli olmak icin ... yil daha calisman gerekir"yazdirsin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet=scan.next().charAt(0) ;

        System.out.println("Lutfen tam sayi olarak yasinizi  giriniz");
        int yas= scan.nextInt();

        if ((cinsiyet=='K' || cinsiyet=='k') && yas>=60) {
            System.out.println("Emekli olabilir");

        } else if ((cinsiyet=='K' || cinsiyet=='k') && yas>=18 && yas<80) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");


        } else if ((cinsiyet=='E' || cinsiyet=='e') && yas>=65 && yas<80) {
            System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismalisin");

        }else {
            System.out.println("Gecersiz bilgi");
        }
    }
}
