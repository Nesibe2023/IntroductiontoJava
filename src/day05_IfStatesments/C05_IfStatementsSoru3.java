package day05_IfStatesments;

import java.util.Scanner;

public class C05_IfStatementsSoru3 {
    public static void main(String[] args) {


        /*

          if cumlelerinde sart parantezinden sonra body ullanmazsak
          ilk ; `e
          yani sadece 1 satir kodu body olarak kabul eder


          eger if body icin yazilacak kod satirdan fazlaysa
          mutlaka {} kullanilmalidir

           soru 3 - kullanicidan bir sayi alin
           sayi 3 ile bolunebiliyorsa üc ile bolunebilen sayi"
           5 ile bolunebiliyorsa "bes ile boluneblen sayi"yazdirin

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0) System.out.println("Uc ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("Bes ile bolunebilen sayi");




























    }
}
