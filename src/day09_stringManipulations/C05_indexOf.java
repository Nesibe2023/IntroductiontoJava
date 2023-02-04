package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str "cok"iceriyor mu?
        System.out.println(str.contains("cok"));  // true

        // kullanicidan aldiginiz cumle "cok" ile baslayan ilk kelimeyi yazdirin.

        System.out.println(str.endsWith("cok"));  // false


        System.out.println(str.indexOf('a')); // 1
        System.out.println(str.indexOf("v"));  // 2

        System.out.println(str.indexOf("cok"));  // 17

        System.out.println(str.indexOf("a",5));  // 13

        // 2.o`nun indexini yazdirin
        // once ilk o`nun indexinin buluruz
        // sonra o index`den sonrasinda 2.o`yu aratiriz
        //









    }
}
