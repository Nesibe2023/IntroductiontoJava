package day15_Scope_arrays;

public class C01_Hastane {

    static String hastaneIsmi = "Yildiz Hastanesi" ;
    static String hastaneAdresi= "Cankaya/Ankara";


    String personelIsmi ;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
        Eger tum method~lardan kullanilabilecek vaariable`lar olusturmak isterseniz
        bu variable`lari class level`de olustururuz

        Clas level`da olusturulacak variable`lar icin 2 ihtimal vardir
        1-static variable (Class variable)
        2-instance(static olmayan) variable (obje variable)

        Kural1- static variable`lar tum objeler icin tek bir deger alir
                instance variable`lar her bir obje icin java tarafindan cogaltilir

        Kural 2- class level variable`lara deger atamasak da kullanabiliriz
                biz degr atamasak bile java class level variable`lara default degerler atar
                non-primitive ==> bull (String)
                sayisal primitive ==> 0
                char ==> hiclik ''
                boolean ==> false

        Kural 3- static olan method`lardan static olmayan variable ve method`lara direk ulasilmaz
                 instance variable ve static olmayan method`lari static olanlardan kullanmak isterseniz
                 obje uzerinden kullanabilirsiniz

        Kural 4- class`da olusturulan instance variable `lar ilk deger atamasini yapar
                    yani bir obje ilk olusturulduugnda otomatik otoamtik olarak instance variable`a atanan degeri alir
                    deger atanmissa default degerleri alir
                    obje olusturulduktan sonra obje uzerinden yapilan atamalar
                    claa level`daki instance variable `a degil, java  tarafindan ousturulup
                    pbjeye yapistirilan kopya variable `a yapilir
         Kural 5 - static variable`lar tum objeler icin ortaktir
                   static variable`lara tum class `dan direk ulasilmalidir
                   static variable
         */

        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1.personelIsmi);  // null
        System.out.println(per1.personelAdresi);  // null
        System.out.println(per1.personelTel);  // null

        // System.out.println(personelIsmi);  kabul etmiyor

        per1.personelIsmi = "Fidan";
        per1.personelAdresi = "Germany";
        per1.personelTel = "+491711232323";

        C01_Hastane per2 = new C01_Hastane();
        System.out.println(per2.personelIsmi);  // null

        per1.personelIsmi = "Yusuf";
        System.out.println(per2.personelIsmi);  // null
        per2.personelIsmi = "Ayten";
        System.out.println(per2.personelIsmi);  // Ayten
        System.out.println(per1.personelIsmi);  // YUsuf


        System.out.println(hastaneIsmi); // Yildiz Hastanesi

        System.out.println(per1.hastaneIsmi);// Yildiz Hastanesi

        per2.hastaneIsmi = "Java Hastanesi"; // Java Hastanesi

        System.out.println(hastaneIsmi);   // Java Hastanesi
        System.out.println(per1.hastaneIsmi); // Java Hastanesi
        System.out.println(per2.hastaneIsmi); // Java Hastanesi

    }

    public static void method1() {
        System.out.println(hastaneAdresi);
    }
}
