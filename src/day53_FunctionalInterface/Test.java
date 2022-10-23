package day53_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        MyInterface<Integer> cube= (x) ->
            System.out.println(x*x*x);

        cube.function(10);

        MyInterface<Integer> oddOrEven=(a)->{
            if (a % 2== 0) {
                System.out.println(a + " is even number");
            }else{
                System.out.println(a+ " is odd number");
            }
        };

        oddOrEven.function(1000);
        oddOrEven.function(75);

        MyInterface<String> reverse = (str) ->{
            for (int i = str.length()-1 ; i >= 0 ; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };

        reverse.function("Wooden Spoon");

    }
}
