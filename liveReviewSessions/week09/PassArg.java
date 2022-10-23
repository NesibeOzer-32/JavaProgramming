package week09;

public class PassArg {
    public static void main(String[] args) {
        sum(7,9);
        //sum void ile yazılmış kod hata veriyor
        //int x= sum1(3,4);
        int y= sum2(3,4);
    }

    public static void sum(int a,int b) {
        System.out.println(a + b);
    }

    public static int sum2(int a,int b) {
        return a + b;

    }
}
