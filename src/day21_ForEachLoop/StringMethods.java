package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("----------------------toCharArray();------------------------");
        System.out.println("Normal bir kelimeyi harflerine ayırarak Array yapar");
         String str= "Java";
         char[] chars= str.toCharArray();

         System.out.println(Arrays.toString(chars));

         for(char each :chars){
             System.out.println("each = " + each);
         }

        System.out.println("-------------------------split()-------------------------------");
        System.out.println("Split parantezi içindeki tırnak içine yazılan yerden ayırarak arrayleri oluşturur." +
                "Eğer boşluk koyarsak boşluklardan ayırır." );
         String sentence="Wooden Spoon";
         String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------------");
        String email= "kosucunesibe@gmail.com";
        String[] str1=email.split("@");
        System.out.println(Arrays.toString(str1));

        System.out.println("-------------------------------------------------------------------");
        String sentence2="Hi. My name is Nesibe. I am a teacher.";
        String[] str2=sentence2.split("\\. ");// nokta"." kullandığında "\\. " onune 2slaş
        System.out.println(Arrays.toString(str2));

    }
}
