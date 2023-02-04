package day23_dateTime_Varargs;

public class C08_Varargs {

    public static void main(String[] args) {

        /*

        Argument olarak tam sayilar alip
        ilk argument haric geriye kalanlari toplayip
        bulunan toplami ilk argumentler ile carpip
        sonucu yazdiran bir method olusturun
        (Not argument sayisi degisken olabilir)
         */

        islemYap(3,4,5,8,1,2);  // 60
        islemYap(5,1);  // 5
        islemYap(4); // 0
        islemYap(3,4,5,6);  // 45
    }

    private static void islemYap(int ilksayi, int... geriyeKalanlar ) {

        int geriyeKalanlarToplami=0;

        for (int each: geriyeKalanlar
             ) {

            geriyeKalanlarToplami +=each;

        }

        System.out.println(geriyeKalanlarToplami * ilksayi);
    }
}
