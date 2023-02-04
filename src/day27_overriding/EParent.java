package day27_overriding;

public class EParent extends DGrandParent {
    @Override
    protected void method1() {
        System.out.println("P method1");

        // @Override notasyonu overridden method ile overriding method`u ile iliskilendirilir
        // eger overridden method`da bu iliskiyi bozacak bir degisiklik yapilirsa
        //@override notasyonu CTE verir
    }

    protected void method2(){
        System.out.println("GP Method2");
    }

    private void method3(){
        System.out.println("P method3");
    }
}
