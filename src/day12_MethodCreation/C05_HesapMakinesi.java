package day12_MethodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        // kullanicidan istedigi islemi alin (+ / * - )
        // bir method olusturup sayilara  istenen islemi uygulayip
        // sonucu bize dondurun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi girin");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Lutfen bir islem secin + , - , / , * ");
        char islem = scan.next().charAt(0);

        hesapMakinesi(sayi1, sayi2, islem);

        System.out.println(hesapMakinesi(sayi1, sayi2, islem));

    }

    public static double hesapMakinesi(double sayi1, double sayi2, char islem) {

        switch (islem) {

            case '+':
                return sayi1 + sayi2;

            case '-':
                return sayi1 - sayi2;

            case '/':
                return sayi1 / sayi2;

            case '*':
                return sayi1 * sayi2;
            default:
                return 0 ;
        }



    }


    }





