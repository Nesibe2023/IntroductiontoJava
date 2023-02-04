package day05_IfStatesments;

import java.util.Scanner;

public class C02_IfStatesments {
    public static void main(String[] args) {

        /*
         Basit if cumleleri kodun geri kalanindan bagimsizdir
         sadece sarta baglidir
         o sart true ise if body calisir
         sart false ise if body calismaz(KOD CALISIR)

         Birden fazla bagimsiz if cumlesi kullanilmissa
         her cumle birbirinden bagimsiz olacagindan

         */




        // kullanicidan bir sayi alip,
        // poziif ise pozitif sayi,
        // 100 ile 999 arasinda ise (sinirlar dahil) "pozitif 3 basamakli sayi"
        // 3 ile bolunebiliyorsa "3un kati"
        // birler basamagi 7 ise "Mukemmel"
        // Seceneklerinden uyfun olanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        // poziif ise pozitif sayi,
        if (0<sayi) {
            System.out.println("pozitif sayi");
        }

        // 100 ile 999 arasinda ise (sinirlar dahil) "pozitif 3 basamakli sayi"
        if (100<=sayi  &&  sayi<=999){
            System.out.println("pozitif 3 basamakli sayi");
        }

        // 3 ile bolunebiliyorsa "3un kati"
        if (sayi%3==0){
            System.out.println("sayi 3`un kati");
        }

        // birler basamagi 7 ise "Mukemmel"
        if (sayi%10==7 || sayi%10==7){
            System.out.println("Mukemmel");
        }





    }
}
