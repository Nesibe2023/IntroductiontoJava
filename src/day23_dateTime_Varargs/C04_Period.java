package day23_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1985,2,16);
        LocalDate bugun=LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas);  // P37Y10M4D
        System.out.println(yas.getYears());  // 37

        LocalDate baslangic= LocalDate.of(2004,9,15);
        LocalDate bitis= LocalDate.of(2009, 7, 30);

        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure);  // P4Y10M15D
    }
}
