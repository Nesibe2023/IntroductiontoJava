package day14_DoWhileLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicdan bir pozitif sayi isteyin
        // sayinin tam kare olup olmadigini bulunuz
        // tam kare ise true degilse false yazdiriniz
        // ornek : input : 16 , output : 4

        int input = 144 ;
        int karekok = 1 ;
        boolean sonuc= false ;


        while (karekok*karekok<=input) {

            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true ;
                break;
            }else {
                karekok++ ;
            }
        }

        System.out.println(sonuc);


          // do while ile yapalim


        do {
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true ;
                break;
            }else {
                karekok++;
            }
        }while (karekok*karekok<=input);


        System.out.println(sonuc);




    }
}
