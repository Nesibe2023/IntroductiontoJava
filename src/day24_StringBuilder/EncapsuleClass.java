package day24_StringBuilder;

public class EncapsuleClass {

    // Java class uyelerine erisimin write and read olarak ayrilmasi istendiginde
    // Encapsulation kullanir

    // Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir

    // sonra istedigimiz yetkiyi verecek public method olustururuz

    public void setSatis(){

    }

    private int satis;  // satis bolumunden deger girilebilsin ama degeri gorunemesin
    private int rapor=100;  // gorulebilsin ama degistirilemesin

    private int halkaAcikSayi = 10;  // herkese acik olsun
}
