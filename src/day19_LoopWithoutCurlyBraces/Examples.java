package day19_LoopWithoutCurlyBraces;

public class Examples {
    public static void main(String[] args) {
        String str="aaabbcccddeeefff";
        String result ="";
        for (int j = 0; j < str.length(); j++) {
            char ch  = str.charAt(j);
            int count  = 0;
            for (int i = 0; i < str.length(); i++) {
                char each  = str.charAt(i);
                if( ch == each){
                    count++;
                }
            }
            if(count == 2){
                result += ch;
            }

        }
        System.out.println("result = " + result);
    }
}
