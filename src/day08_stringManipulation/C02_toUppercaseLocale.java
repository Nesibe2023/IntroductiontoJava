package day08_stringManipulation;

import java.util.Locale;

public class C02_toUppercaseLocale {
    public static void main(String[] args) {

        String str ="Java Candir";

        System.out.println(str.toLowerCase());  // java candir

        str= str.toLowerCase(Locale.forLanguageTag("Tr")) ;  // java candir
        System.out.println(str);

        str = "Sevgi insani hayata baglar" ;
        System.out.println(str.toUpperCase());  // SEVGİ İNSANİ HAYATA BAGLAR


        str= str.toUpperCase(Locale.forLanguageTag("Tr")) ; //  sevgi insani hayata baglar
        System.out.println(str);






    }
}
