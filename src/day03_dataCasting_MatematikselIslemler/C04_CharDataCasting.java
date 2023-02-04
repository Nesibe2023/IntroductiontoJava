package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        /* char data turunun ekstra bir ozelligi vardir
           eger matematiksel bir islemde char data turunden bir deger kullanirsaniz
           Jav o char`in ascii degerini gozonunde bulundurarak
           matematiksel islemi gerceklestirir


         */

        System.out.println('a'+'b');  // 97+98=195
        System.out.println('a'-32);   // 97-32= 65

        System.out.println((char)('a'-32));  // A

        // Kullanicidan bir char alip
        // ascii table`dan kullanicinin girdigi char`in sonrasindaki
        // 3 karakteri yazdirin
        // ornek input : a output : b,c,d

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter= scan.next().charAt(0);


        System.out.println((char) (girilenKarakter+1) + " , "+
                           (char) (girilenKarakter+2) + " , "+
                           (char) (girilenKarakter+3) + " , ");


    }
}