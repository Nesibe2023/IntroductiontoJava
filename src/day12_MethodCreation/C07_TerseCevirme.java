package day12_MethodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {

        // verilen bir String`i terse cevirip
        // o halini bize donduren bir method olusturun

        System.out.println("Java Candir");

    }

    public static String metniTerseCevir(String str){

        String tersStr="";

        for (int i = str.length()-1 ; i >=0 ; i--) {

            tersStr +=str.charAt(i);

        }
      return tersStr ;

    }
}
