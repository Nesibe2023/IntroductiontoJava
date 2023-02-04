package day04_Increment_Concatenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {

        int sayi = 20 ;

        // sayiyi 3 artirin. 3 seilde yazilabilir

        sayi = sayi + 3 ;

        sayi += 3;

        sayi ++;   // bunu 3 artirak icin kulanmayiz. sadece 1 artirmak icin kullaniriz
        sayi++;
        sayi++;

        System.out.println(sayi); // 29

        // sayinin degerini 2 azaltin

        sayi= sayi - 2 ;

        sayi -= 2 ;

        sayi --;
        sayi--;


        sayi = 10 ;
        // sayinin degerini  1 azaltin ve yazdirin

        sayi--;
        System.out.println(sayi);   // 9
        // bu islmede ekranda gordugumuz 9, sayinin degeri de 9
        System.out.println(sayi);  // 9


        sayi = 10 ;
        // sayiyi once yazdirin, sora 1 azaltin

        System.out.println(sayi);  // 10
        sayi--;

        // ekranda gorulen 10, ama sayinin son degeri
        System.out.println(sayi);  // 9



        sayi =10;
        sayi++; // sayiyi 1 artirir
        ++sayi;  // sayiyi 1 artirir
        System.out.println();  // 12


        sayi = 10 ;
        System.out.println(sayi++); // 10
        // Java ayni satirda iki islem oldugundan siralma yapar
        // eger ++ variable `dan sonra ise artirma islemini sonra yapar
        // bu durumda once yazdirma, sonra artirma islemi yapar

        System.out.println(sayi);  // 11

        sayi= 10;
        System.out.println(++sayi);
        // ++ variable`dan once ise artirma islemini once yapar
        // ub durumda java once artirma sonra azdirma islemi yapar

        System.out.println(sayi);  // 11






    }
}
