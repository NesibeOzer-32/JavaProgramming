package day08_SingleIf;

public class SingleIfStatement {
    public static void main(String[] args) {
        int number = 300;
       /* System.out.println("Odd number");
        System.out.println("Even number");*/
        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        if (!evenNumber) {
            System.out.println(number + " is odd number");
            System.out.println(".....................");
        }
        int n = 200;
        if(n>0){
            System.out.println(n + " is possitive");
        }
        if(n<0){
            System.out.println(n + " is negative");
        }
        if(n==0){
            System.out.println(n + " is zero");
        }
        /*boolean possitive = n>0 ;
        boolean negative = n<0;
        boolean zero = n ==0;
        if (possitive){
            System.out.println(n + " is possitive" );
        }
        if (negative){
            System.out.println(n + " is negative" );
        }
        if (zero){
            System.out.println(n + " is zero" );
        }*/
    }
}
