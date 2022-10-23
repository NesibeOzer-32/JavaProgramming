package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

public class AccsessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);

        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3(); inisiable other classes
    }
}
