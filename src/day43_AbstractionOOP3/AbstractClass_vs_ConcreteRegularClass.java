package day43_AbstractionOOP3;


abstract class A{
    //can not be final
    public A (){}

    public void method1(){}

    public static void method2(){}

    public abstract void method3();
}
class B extends A{
    @Override
    public void method3() {

    }
    //can be final

}
public class AbstractClass_vs_ConcreteRegularClass {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B();
            }
        }
