package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        // java `da bir ck yapida get ve set method `lari bulunur
        // get methodlari bilgiyi bize getirirken
        // set metotlari blgiyi update eder

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); // [A, Z, T]

        // 2.index`e F elemntini ekleyin
        // add method`u var olan listenin herhangi bir elementi degistirmeden
        // istedigimiz elementi ekler, kalanlari kaydirir

        harfler.add(2, "F");
        System.out.println(harfler);  // [A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);  // [A, Z, M, T]

        // set method`u var olan elementin degerini gunceller
        // eleman sayisini artirmaz

    }
}
