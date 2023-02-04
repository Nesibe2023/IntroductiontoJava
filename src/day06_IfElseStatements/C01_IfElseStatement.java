package day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "Eskenar ucgen"yazdirin, degilse "Eskenar ucgen degil" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }


        /* If ile baslayan bir kod else ile bitiyorsa
        input`un tum degerlerini kapsar
        yani her deger icin mutlaka kodumuzda bir body calisir
         */





    }
}
