package day17_While_DoWhile;

public class FrequancyOfWord_WhileLoop2 {
    public static void main(String[] args) {
        String names = "Nesibe ayşe ahmet nesibe ali nesibe merve nesibe necati";
        names = names.toLowerCase();
        int frequancy = 0;
        while(names.contains("nesibe")){
            names = names.replaceFirst("nesibe","");
            frequancy++;
        }
        System.out.println("frequancy = " + frequancy);
    }
}
