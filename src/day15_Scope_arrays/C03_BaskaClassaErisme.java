package day15_Scope_arrays;

public class C03_BaskaClassaErisme {

    public static void main(String[] args) {

        /*
        java OOP konsept cercevesinde baska class`lardaki class uyelerini  (variable / method) kullanabiliriz
        baska class1 daki herhangi bir class uyesine erismek istedigimizde
        static keyword onemli bir rol oynar

        static olarak isaretlenen class uyelerine
        classIsmi.staticuyeIsmi seklinde ulasabilriz

        Static olmayan class uyelerine erisebilmek icin obje olusturmaniz gerekir

        Java runtime program`dir
        basinca calisir, caistigi surece yapilan islemleri KALICI olarak tutar
        calisma bittiginde HER SEY YOK OLUR

         */

        System.out.println(C01_Hastane.hastaneAdresi);  // Cankaya/Ankara
        C01_Hastane.method1(); // Cankaya/Ankara
        System.out.println(C01_Hastane.hastaneIsmi);  // Yildiz Hastanesi

        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi

        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.hastaneAdresi="Uskudar" ;

        System.out.println(per1.personelIsmi); // Belkis
        System.out.println(per1.personelAdresi) ; // Istanbul
        System.out.println(per1.personelTel); // null
        System.out.println(per1.hastaneIsmi);  // Yildiz
        System.out.println(per1.hastaneAdresi);  // uskudar
    }
}
