package week09;

public class DeepAndDeeper {
    public static void main(String[] args) {
        System.out.println("Not a deep");
        deep();
        System.out.println("Not a deep");
    }

    public static void deep() {
        System.out.println("Deep");
        deeper();
        System.out.println("Deeper");

    }

    public static void deeper() {
        System.out.println("Deeper");

    }
}
