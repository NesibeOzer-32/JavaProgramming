package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        HelloWorld5Times();
        System.out.println("----------------------------------------");
        HelloCydeo5Times();
        System.out.println("----------------------------------------");
        System.out.println("Even Numbers");
        evenNumbers();
    }

    public static void HelloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }
    public static void HelloCydeo5Times() {
        for (int j = 0; j < 5; j++) {
            System.out.println("Hello Cydeo");
        }


    }

    public static void evenNumbers() {
        for (int i = 0; i < 11; i+=2) {
            System.out.println(i);

        }

    }

}
