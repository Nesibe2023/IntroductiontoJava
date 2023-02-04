package day08_stringManipulation;

public class C03_equels {
    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "Java";

        String str3 = new String("Java");

        String str4 = "Ja";

        String str5 = str4.concat("va") ;


        System.out.println(str1==str2); // true

        System.out.println(str1==str3); // false

        System.out.println(str1==str5); // false

        /*
            == string icin bekledigimiz sonuclari vermeyebilir.
            cunku hem metnin degerinihem de objenin referansini karsilastirir.
            bunu ileride anlatacaz
            Java`da string objelerin metinlerinin ayni olup olmadigini kontrol etmek icin
            == yerine equels methodù KULLANILMALIDIR.

         */
        System.out.println("===============");

        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true

        System.out.println(str1.equals(str2));  // true

    }

}
