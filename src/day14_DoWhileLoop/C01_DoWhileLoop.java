package day14_DoWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0`a basarsa islemi bitirin

        int girilenSayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lutfen toplanmak icin bir tam sayi giriniz");
            girilenSayi=scan.nextInt();

            toplam += girilenSayi;

            System.out.println("Girilen sayilarin toplami : " + toplam);

            /*
            While Loop`un 2 tane negatif yonu vardir
            1-Loop`dan once olusturdugumuz ve loop `da kullanacagimiz variable`lara
             yanlis bir deger verirsek, loop body`sin hic calismayabilir

            2-loop bir deger verirsek
             */
        }





    }
}
