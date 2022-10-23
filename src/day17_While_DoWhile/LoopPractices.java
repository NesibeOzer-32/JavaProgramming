package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {
        System.out.println("............................for Loop...................................");
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("............................while loop..............................");
        int j = 0;
                while(j<10){
                    j++;
                    System.out.print(j);
                }
        System.out.println("");
        System.out.println("............................Do while loop..............................");
        int k = 1;
        do{
            System.out.print(k);
            k++;
        }while(k<11);
    }
}
