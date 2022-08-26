package day43_AbstractionOOP3;

interface AA{
    int a=100;// static and final
    //doesnt have constructor
    //doesnt have instan method
    //doesnt have static method

    //dont have to write key word... by compiler
    void method3();

    public default void method5(){
        //has body
    }

}

abstract class X{
    private int a;
    protected static int b;

    //has constructor
    public X(){

    }
    //has instant method
    public void method(){

    }
    //has static method
    public static void method2(){

    }
    //have to write abstract
    public abstract void method4();
}
public class AbstractClass_vs_Interface {
    public static void main(String[] args) {

        //AA obj= new AA();

        //X obj2 = new X();

    }
}



