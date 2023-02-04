package day12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // veerilen bir String`in palindromee olup olmadigini yazdirin

        // palindrome : duz okunusu ile etersten okunusu birbirine ayni olan

        String str = "ana" ;

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin bir palindrome");
        }else {
            System.out.println("Verilen metin bir palindrome degildir");
        }
    }
}
