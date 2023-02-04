package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {

    public static void main(String[] args) {

        /*
        Try-catch bloklarinin amaci
        riski 0 yapmak degil
        kodu iyi analiz yapip
        java`nin cozemeyecgi durumlarda ne yapmasini istedigini kendisine soylemektir

        java try blogunda basedemeyecegi bir sorunla karsilasirsa
        siz o sorunu deklare edinceye kadar
        yani catch satirina kadar calismayi durdurur

        bu udurmda sorun olan satir ile catch satiri arasindaki kodlar calismaz

         */


            // Kullanicidan iki tamsayi alip
            // sayilari biribirine bolup, sonucu yazdirin

            Scanner scan = new Scanner(System.in);
            System.out.println("biribirine bolmek icin 2 tam sayi giriniz");

            int sayi1 = scan.nextInt();
            int sayi2 = scan.nextInt();


        try {
            System.out.println("iki sayinin bolumu : " + sayi1 / sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            System.out.println(e.getCause());
        }


    }

    }
