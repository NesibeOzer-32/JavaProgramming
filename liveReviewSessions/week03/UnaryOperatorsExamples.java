package week03;

public class UnaryOperatorsExamples {
    public static void main(String[] args) {
        int a =25;
        System.out.println(++a);
        System.out.println(--a);

        int b =25;
        System.out.println(a++);
        System.out.println(a--);
        a = 50;
        a = --a + a++ + a-- + a++;
        System.out.println("a = " + a);

        a = 1;
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(--a);
        a = a-- + a++ /a-- * --a;
        System.out.println(a);

    }
}
