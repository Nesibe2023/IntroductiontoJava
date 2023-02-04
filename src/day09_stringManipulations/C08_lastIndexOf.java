package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calismam lazim cok." ;

        // ilk a`nin indexini yazdiralim
        System.out.println(str.indexOf("a"));  // 1


        // son a`nin indexini yazdiralim

        System.out.println(str.lastIndexOf("a"));  // 39

        // verilen str`da ck kelimesinin kullanimini kontrol edip,
        // - cok kelimesi kullanilmamais
        // - bir kere kulanilmis
        // - birden fazla kullanilmis
        // sonuclarindan uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calismam lazim cok.


        int ilCokIndexi = str.indexOf("cok");
        int sonCokIndexi= str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("cok kelimesi kulanilmamis");
        } else if (ilCokIndexi==sonCokIndexi) {
            System.out.println("cok kelimesi bir kere kullanilmis");
        }else {
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }


    }
}
