package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // kullanicidan gun ismini girmesini isteyini
        // girilen gun haftaici bir gun ise " Simdi calisma zamani tatile .. gun var
        // seklinde haftasonu tatiline kac gun kaldigini yazdirin
        // girilen gun hafta sonu ise "simdi dinlenme zamani" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        /*
         string ifadeler case sensitive dir. kullanicinin Pazar, PAzar, PAZAR, VS 32 farkli sekilde yazilabilir

         Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez
         bunun yerine kullanicinin girdigi degeri degistirip yeni bir avriable a atama yapar
         ve kodalrimizda yeni variable kullanilir

         */


        switch (kullanilacakGun){
            case "pazartesi" :
                System.out.println(girilenGun  + " Simdi calisma zamani, tatile 5 gun var");
                break;
            case "sali" :
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 4 gun var");
                break;
            case "carsamba" :
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 3 gun var");
                break;
            case "persembe" :
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 2 gun var");
                break;
            case "cuma" :
                System.out.println(girilenGun + " Simdi calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println(girilenGun  +  " simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun girdiniz");
        }


    }
}
