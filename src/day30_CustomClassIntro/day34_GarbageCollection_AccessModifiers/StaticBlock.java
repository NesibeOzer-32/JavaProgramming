package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    //used for initializing static variables
    //run first before everything,only runs one time
    //if static variable need several steps best way
    public static void main(String[] args) {//ilk static block kodu çalışır

        System.out.println("Main method");

    }
    static { //runs first before anything, and only runs one time
        System.out.println("Static block");
    }
    static {
        System.out.println("Static block2");
    }
    static {
        System.out.println("Static block3");
    }

}
