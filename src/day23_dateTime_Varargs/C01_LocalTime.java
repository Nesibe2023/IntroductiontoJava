package day23_dateTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime zaman= LocalTime.now();
        System.out.println(zaman);  // 10:12:19.063001300

        System.out.println(zaman.getMinute());  // 12

        System.out.println(zaman.withSecond(0).withNano(0)); // 10:12
        System.out.println(zaman.withSecond(0).withNano(1)); // 10:12:00.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250)); // 18:22:19.063001300

        // bir for loop ile 1 `den 1000`e kadar olan sayilari yanyana yazdirin
        //bu islem icin gecen zamani bulun

        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic" + zaman);   //  bitis 10:21:29.340974400
        for (int i = 0; i <=10000 ; i++) {
            System.out.print(i+" ");

        }
        LocalTime bitZamani=LocalTime.now();
        System.out.println("");
        System.out.println("bitis "+ bitZamani);

        System.out.println("Islem suresi  : " +
                          (bitZamani.getNano()-basZamani.getNano())
                           + "nano saniye");  // Islem suresi  : 46872500nano saniye

        /*
        Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
        olusturdugumuz satirdaki zamani veya tarih`i sistemden alip kaydeden bir variable`dir

        ilerleyen satirlarda guncel zaman veya tarieh ihtiyacimz oldugunda
        yeni time veya data objesi olusturup
        o andaki degeri alabiliriz

         */
    }
}
