package day17_While_DoWhile;

public class FrequencyOfWord3 {
    public static void main(String[] args) {
        String  str = "Nesibe Nesibe Berat Nesibe Merve Necati";

        int frequency = 0;

        for (int i = 0; i <= str.length()-6; i++) {
            String eachSub =    str.substring(i, i+6 );

            if(eachSub.equalsIgnoreCase("Nesibe")){
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}

