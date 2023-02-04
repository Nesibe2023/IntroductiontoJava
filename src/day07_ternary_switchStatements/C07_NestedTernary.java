package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin
        // Sayi pozitifse, cift sayi veya sayi sayi degil seceneklerinden uygun olani yazdirin
        // sayi pozitif degilse, 3 basamakli veya 3 basamkli degil secenklerinden uygun olani yazdirin

        int sayi=23 ;

        // System.out.println(sayi>0 ? "sayi pozitif"  : "sayi pozitif degil");

        System.out.println(sayi>0
                            ?
                            sayi%2==0 ? "cift sayi"  :  "tek sayi"
                            :
                            -100>=sayi && sayi>=-999 ? "3 basamakli " :  "3 basamakli degil"
                            );


         // yanyana yazilsa uzun ve karmasik oluyor.









    }
}
