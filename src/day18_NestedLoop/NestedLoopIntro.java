package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        /* Aynı loopun 5 kere tekrarının tek tek yazılımı:
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        Kısa yolu: */
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }
    }
}
