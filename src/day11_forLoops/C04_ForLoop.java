package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // Eger sart i`nin hicbir degeri icin true olmuyorsa
        // Input olarak verilen sayidan 1`e kadar tum sayilari yazdirin

        int input = 23; // eger kullanicinin poziif ve negatif girebilecegini ongorup
                        // ona gore kod yazmazsak,

        if (input>1){

        for (int i = input; i >= 1; i--) {
            System.out.print(i + " ");

           }
        } else {
            for (int i = input; i <= 1; i++) {
                System.out.println(i + " ");
            }

        }

        // eger sart i`nin tum degerleri icin dogru oluyorsa
        // teknik olarak sonsuzluk olusr deriz
        // bilgisayarimiz sonsuza kadar calismaz, ram dolar veya integerin sinirina ulasilir
        // ama teknik olarak sonsuz loop denir

        // input olarak verilen sayidan 100`e kadar tum tam sayilari yazdiralim

        for (int i = input ; i <=100 ; i++){   // i-- yazsak sonsuz loop olusur
            System.out.print(i + " ");
        }
    }
}
