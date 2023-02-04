package day16_arrays;

public class C07_Soru {
    public static void main(String[] args) {

        // verilen bir array`de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun

        int[] arr={2,3,4,2,5,2,6,7,4,5,1,24,6,3,1,9};
        int arananSayi=2;

        elemaniBul(arr,arananSayi); // aradiginiz 2 array`de 3 adet kullailmistir
        elemaniBul(arr, 8); // aranan sayi array`de yok
        elemaniBul(arr, 5); // aradiginiz 5 array`de 2 adet kullanilmistir

    }

    public static void elemaniBul(int[] arr, int arananSayi){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananSayi){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("Aranan sayi array`de yok");
        }else {
            System.out.println("Aradiginiz " + arananSayi + "  array`de "  + sayac + " adet kullanilmistir");
        }
    }
}
