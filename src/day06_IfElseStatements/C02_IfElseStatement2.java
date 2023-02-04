package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatement2 {

        public static void main(String[] args) {

            // Soru 1- Kullanicidan ucgenin 3 kenar uzunlugunu alin,
            // ucgen ikizkenar ise "ikizkenar ucgen"yazdirin, degilse "ikizkenar ucgen degil" yazdirin.

            Scanner scan = new Scanner(System.in);
            System.out.println("Ucgenin kenar uzunluklarini giriniz");
            double kenar1 = scan.nextDouble();
            double kenar2 = scan.nextDouble();
            double kenar3 = scan.nextDouble();

                if ((kenar1 == kenar2 && kenar1 != kenar3) ||
                    (kenar2 == kenar3 && kenar2 != kenar1) ||
                    (kenar3 == kenar1 && kenar3 != kenar2)) {
                System.out.println("ikizkenar ucgen");
            } else {
                System.out.println("ikizkenar ucgen degil");
            }

        }}
