package day23_dateTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2022-12-20T10:37:33.485614600

        // Sadece tarihi 20/12/2022 olarak yazdiralim

        DateTimeFormatter format1= DateTimeFormatter.ofPattern(" ");

        // Sadece tarihi 12/20/22  TUE seklinde  yazdiralim

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2));


        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format3)); // 11:11 ÖÖ









        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar


         */
    }
}
