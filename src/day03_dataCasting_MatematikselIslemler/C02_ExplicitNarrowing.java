package day03_dataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
          Eger grnis kapasiteli bir data turunden dar kapasiteli bir data turune casting yapmak isterseniz

         Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
         islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
         (donusturmek istedigimiz data turu) yazilmalidir.
         */

        double dbl = 23.5 ;

        int sayi = (int)dbl;
        System.out.println(sayi); // 23

        byte byt= (byte)sayi;  // ongoremeyiz, risk var java bu riski almaz.
                               // ama parantezli yeri ekeyip yapinca mecbur kabul eder

        System.out.println(byt); // 23

        sayi= 130 ;
        byt = (byte)sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahele ister. ilk hali :byt= sayi
                          // parantezli yeri ekleyinjce mevbur kabul etti

        System.out.println("int 130`un byte hali : "+byt  );  // -126


        sayi= 256 ;
        byt = (byte)sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahele ister. ilk hali :byt= sayi
        // parantezli yeri ekleyinjce mevbur kabul etti

        System.out.println("int 130`un byte hali : "+byt  );  // 0

        sayi= 13000 ;
        byt = (byte)sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahele ister. ilk hali :byt= sayi
        // parantezli yeri ekleyinjce mevbur kabul etti

        System.out.println("int 130`un byte hali : "+byt  );  // -56

    }
}
