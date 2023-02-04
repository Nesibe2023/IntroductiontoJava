package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
                eger coklu element iceren bir apidaki tum elementlere
                ayni islemi yapmak istiyorsak
                index`den bagimsiz for each loop kullanilabilir

                for each loop`da 3 seyi belirtmemiz gerekir
                1-getirilecek elementlerin data turu
                2-getirilen elemente verilecek isim (genelde each/ w kullanilir)
                3-nereden getirilecegi
         */

        int[] arr= {2,4,6,8,1};

        // bu array`in tum elementlerini yazdirin

        for (int each: arr
        ){
            System.out.println(each + " ");
        }

        // tum elementleri toplayalim

        int toplam=0;

        for (int each : arr
        ){
            toplam +=each;
        }

        System.out.println("sayilarin toplami : " + toplam);

        // tum sayilarin karelerini toplayalim

        toplam=0;

        for (int each : arr
        ) {

            toplam+=each*each;

        }

        System.out.println("sayilarin kareleri toplami = " + toplam);


    }
}
