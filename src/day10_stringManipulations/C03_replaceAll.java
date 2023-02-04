package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        // bu metindei sayilardan kurtulun

        String str="Ja1va 56Gu,zel-dir";

        System.out.println(str.replace("1", "")
                              .replace("5", "")
                              .replace("6", ""));  // Java Guz, zel-dir

        str= "Ja1va 56Gu,zel-dir";

        /*
         replace() zaten istenen degiskligi verilen ozellige uyan tum degerler icimn yapar

         eger genellemeyi butun sayilari, buutn space`leri , butun ozel karakterler
         gibi genisletmek istersek replace() yerne replaceAll() kullaniriz

         Java bu genllemeleri yazabimemiz icin regex(regular expressions) tanimlamistir

         \\d : butun digit`ler

         */


        str=str.replaceAll("\\d", "");
        System.out.println(str);

        // ozel karakterlerden de kurtulun
        // space de ozel karaker oldugundan, bu durumda space`in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str= str.replaceAll("\\W" ,"" );  // JavaGuzeldir

        str=str.replace(" ", "5");

        str=str.replace("5", " ") ;

        System.out.println(str);





















    }
}
