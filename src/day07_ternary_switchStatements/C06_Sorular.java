package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {

        //  Kullanicidan nounu alin, 50 vya daha buyukse "Sinifi Gectin",
        // 50`den kucukse "Malesef kaldiniz" yazdirin

        int input=54 ;

        System.out.println(input>=50 ? "Sinifi gectin"  : "Malesef kaldin");

        // Soru 3 - Kullanicidan bir harf isteyin,
        // girilen karaker kucuk harf ise onu buyuk harf olarak yazdirin
        // yoksa girilen harfi yazdirin

        char karakter= 'a';
        System.out.println(karakter>='a' && karakter<='z'  ? (char)(karakter-32) : karakter);

        // SORU 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input=5 ;

        // |5|>=5    |-4|>=(-1)*(-4) >= 4

        System.out.println(input>0 ? input : (-1)*input);





















    }
}
