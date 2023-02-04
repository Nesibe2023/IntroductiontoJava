package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        // kullanicidan ismini alin
        //ve girilen ismi buyuk harflerle yazdirin

        // Kullaniicdan deger almak icin 3 islem yapmamiz gerekir
        //1.adim scanner objesi olusturmak

        Scanner scan = new Scanner(System.in) ;

        //2.adim kullaniciya ne istediginizi soyleyin

        System.out.println("ïsminizi yazin");

        // 3.adim kullanicinin girecegi degeri kaydedeceginiz bir variable olusturun
        //  scan objesi ile ilgili methodu kullanarak kullanicilarin girdigi degeri
        //  olusturdugumuz variablea sorar

        String girilenIsim = scan.nextLine();

        // Artik kullanicinin girdigi deger girilen isim variableìnda kayitli

        System.out.println(girilenIsim.toUpperCase());
    }
}
