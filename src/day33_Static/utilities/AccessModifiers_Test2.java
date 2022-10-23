package day33_Static.utilities;

import day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);//ALWAYS reachable
        //System.out.println(AccessModifiers.defaultData);only reachable within same package
        //not visible outside the package
        //System.out.println(AccessModifiers.privateData);only reachable within same class
        //not visible outside the class
        AccessModifiers.method1();
        //AccessModifiers.method2();not visible outside the package
        //AccessModifiers.method3();not visible outside the class

    }
}
