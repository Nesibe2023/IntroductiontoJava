package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        // verilen bir Array`i Natural Order`a gore siralayip yazdirin

        String [] isimler={"Huseyin", "Yusuf", "Mehmet","Akile", "Mahmut", "ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));  // [Huseyin, Said, Mehmet, Akile, Said]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Akile, Huseyin,Mehmet,Said,Yusuf]

        // eger buyukten
    }
}
