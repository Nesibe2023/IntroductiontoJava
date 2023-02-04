package day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi alip
        // sayilari biribirine bolup, sonucu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("biribirine bolmek icin 2 tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            // try bolumu yapmak istediginiz ama exception riski olusturan kodlar
            System.out.println("iki sayinin bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e)

                // catch() : bekledigimiz kuhtemel exception ve
                //           bu exc. gerceklesirse hata dokumanini store edebilecegimiz variable


        {
            System.out.println("bolecek sayi 0 olamaz");
            // catch blogu : exception gerceklesirse calismasini istediginiz kodlar
            //               burayi yazarken oncelikle
            //              exp/olustugunda kodlarin calismasi dursun mu? yoksa devam mmi etsin
            //              karar vermeliyiz
        }

    }
}
