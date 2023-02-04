package day03_dataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        // % Modulus : java`da bolme islemi sonucunda kalan sayiyi verir

        System.out.println(15 % 4);  // 3 kalan

        System.out.println(45 % 4 );  // 1 kalan

        /* kullanicinin girdigi deger cisft sayi mi ?
           girilenSayi % 2 isleminin sonucu 0 ise cift sayidir

           kullancin girdigi sayi 7`nin kati mi?
           girilenSayi % 7 isleminn sonucu 0 ise 7`nin katidir  ( %=modulus demek, yuzde demek degil)

           kullanicini grdigi sayinin birler basamagi
           kullanici 3426 girdi

         */

        int girilenSayi = 3426 ;
        int birlerBasamagi = girilenSayi % 10 ;  // 6
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi = girilenSayi/10;
        System.out.println(girilenSayi);  // 342





    }
}
