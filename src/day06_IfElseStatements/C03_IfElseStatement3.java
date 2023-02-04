package day06_IfElseStatements;

import java.text.CharacterIterator;
import java.util.Scanner;

public class C03_IfElseStatement3 {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);


        if (girilenKarakter>='a'  && girilenKarakter<='z'){
            // kuuck harf ise buyuk harf olarak yazdirin
            System.out.println((char)(girilenKarakter-32));
            System.out.println(Character.toUpperCase(girilenKarakter));
        }else {
            // kucuk harf degilse girilen harfi yazdiralim
            System.out.println(girilenKarakter);

        }







    }
}
