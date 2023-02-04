package day08_stringManipulation;

public class C07_subString {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());  // karakter sayisi : 19

        // metnin tam ortaasindaki karakter nedir?

        System.out.println(str.charAt(str.length()/2));

        // son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1));

        // bir karakteri degil de veilen bir stringin icerdigi bir parcayi elde etmek istersek
        // ogren kelimesini yazdiralim


        System.out.println(str.substring(5,9)); // ogre
        // substring(bas, bitis) methodunda
        // baslangic olarak yazilan index dahil(inclsive)
        // bitis olarak yazilan index haric (exclusive dir)
        System.out.println(str.substring(5,10));  // ogren

        // str`dan java kelimesini yazdiralim
        System.out.println(str.substring(0,4));   // java

        // str`dan "kap" yazdiralim
        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16));  // kap
        System.out.println(str.substring(str.length()-3));  // kap

        // substring kullanarak sadece j harfini yazdirin

        System.out.println(str.substring(0)); // java ogren, isi kap
        System.out.println(str.substring(0,1));  // J

        // substring kullanarak 9.indexdeki harfi buyuk olarak yazdirin
        System.out.println(str.substring(9,10));   // n
        System.out.println(str.charAt(9));

        // charAt kullanmak yerine substring kullanmak daha avantajli olabilir
        //cunku substring kullanarak ifade edilen hala string oldugundan
        // method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5)) ;  // hiclik yazdirir bos bir satir yazdirir
        System.out.println("===========");

       // System.out.println(str.substring(4,3));  // StringIndexOutOfBoundsException
        //System.out.println(str.substring(25,28));  // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()-1)); // p
        //System.out.println(str.charAt(str.length()));   //StringIndexOutOfBoundsException
        //System.out.println(str.charAt(str.length())+1);  //StringIndexOutOfBoundsException


        System.out.println("===========");






    }
}
