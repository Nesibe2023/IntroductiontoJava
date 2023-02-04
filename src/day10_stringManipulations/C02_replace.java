package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str="Java ogren, adana ye";

        System.out.println(str.replace('a', 'A'));  // JAvA ogren AdAnA ye

        System.out.println(str.replace(" ", ""));  // Javaogren,adanaye

        System.out.println(str.replace("Java" , "Yazilim"));  // Yazilim ogren, adana ye

        String telefon="555 345 12 34" ;
        System.out.println(telefon.replace('3', '7')); // 555 7451274

        System.out.println(telefon.replace("555", "532"));

        // asagidaki arama sonucunu 10000`den fazla oldugunu test edin

        String sonuc="1-16 of over 100,000 results for \"apple\" ";

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");

        String sonucSayisiStr= sonuc.substring(indexOver+5, indexOver-1);
        System.out.println(sonucSayisiStr); // 100,000

        sonucSayisiStr=str.replace(",", "");

    }
}
