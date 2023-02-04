package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /* soru 3



         */


        Scanner scan = new Scanner(System.in);




        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        String girilenYas = scan.nextLine();



        System.out.println("ïsminiz : " + girilenIsim +
                           "\nSoyisminiz : " + girilenSoyisim +
                           "\nyasiniz : " +  girilenYas +
                           "\nkaydiniz basariyla tamamlanmistir ");
    }
}
