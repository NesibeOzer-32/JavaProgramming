package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

public class StaticMembers {
    //Static Members
    /*
    1.Class:inner class(nested)
    2.Variable
    3.Methods
    4.Block
     */
    class class1{//1.Class:inner class(nested)

    }
    public static int num=100;//2.Variable
    public static void method(){//3.Methods

    }
    static {//4.Block

    }
}
class A{//OUTER CLASS-Static olamaz
    static class B{//İNNER CLASS-Static olabilir
        public static void method1(){

        }
    }
}
class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}