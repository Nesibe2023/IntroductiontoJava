package day02_variables_scanner;


import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /* soru 7 - kullanicidan iki sayi alip
    ikisinin degerlerini degistirin (swap)







     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1`i giriniz ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen sayi2`i giriniz");
        int sayi2 = scan.nextInt();

        int temp ;

                // 1.adim sayi2 degerini temp`e atayalim

        temp= sayi2 ;

                // 2.adim sayi1 degerini sayi2 ye atayalim

        sayi2 =sayi1 ;

                // temp deki degeri sayi1 e atayalim

        System.out.println();



    }



}
