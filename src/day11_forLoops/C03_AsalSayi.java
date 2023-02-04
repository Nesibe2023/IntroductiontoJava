package day11_forLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // input olarak verilen bir tam sayinin
        // asal sayi olup olmadigini yazdirin

        int input=21 ;
        // String sonuc="Sayi asal";

        for (int i = 2 ; i <input ; i++){

            if (input%i==0){
                System.out.println("sayi asal degil");
                break;
                // Java, bir loop icerisnde "break"gorurse
                // o Loop`u bitirir
            }
        }
       // System.out.println(sonuc);
    }

}
