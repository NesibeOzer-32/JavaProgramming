package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    //public> default >private
    public static int publicData=100;//ALWAYS reachable
    static int defaultData=200;//ONLY reachable within same package(ONLY package day34)
    private static int privateData=300;//ONLY reachable within same class(ONLY this class)

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private static void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);
    }

    }

