package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir" ; // 13 tane karakter barindirir.

        // java`da index 0`dan baslar
        // J==0.index, r==>12
        // charAt(index) ile istedigimiz index`deki char`a ulasabilirsiniz


        // ilk a`yi yazdiralim
        System.out.println(str.charAt(1));

        // sondan 2.harfi yazdiralim
        System.out.println(str.charAt(13-2));   // karakter sayisi  -2 . indexdeki eleman

        // sondan 4. karakteri buyuk harf olarak yazdirin
        System.out.println(str.charAt(13-4));  //

        // charAt() method`u bize char dondurdugu icin toUppercase() calismaz
        // String method`larini charAt() ile kullnamak isterseniz
        // charAt()`den once kullanmaisiniz

        // System.out.println(str.charAt(18)); // StringIndexOutOfBoundsExceptions
        // eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index`i bulamayacagi icin hata verir
    }
}
