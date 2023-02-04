package day27_overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method2();
    }

    @Override
    protected void method2() {
        super.method1();
    }

    private void method3(){
        System.out.println("Child method3");
        // parent class`da ayni isimde method olmasina ragmen
        // override olarak gorunmedi
        //sebep : parent`daki method3 private access modifier`a sahip ldugundan
        //onu ayri bir method olarak gorur, override olarak gormez
    }
}
