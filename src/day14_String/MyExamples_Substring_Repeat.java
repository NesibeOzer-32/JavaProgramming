package day14_String;

public class MyExamples_Substring_Repeat {
    public static void main(String[] args) {
        System.out.println("...............Substring..................");
        String name = "Nesibe Ozer";
        String word = name.substring(0,6);
        System.out.println("word = " + word);
        String word2 = name.substring(7);
        System.out.println("word2 = " + word2);
        String schoolname = "Hacettepe University";
        String word3 = schoolname.substring(0,9);
        System.out.println("word3 = " + word3);
        String word4 = schoolname.substring(10);
        System.out.println("word4 = " + word4);
        String kidsname = "Ayşe Ali Ahmet";
        String kid1 = kidsname.substring(0,kidsname.indexOf(" "));
        System.out.println("kid1 = " + kid1);
        String kid2 = kidsname.substring(kidsname.indexOf(" ")+1,kidsname.lastIndexOf(" "));
        System.out.println("kid2 = " + kid2);
        String kid3 = kidsname.substring(kidsname.lastIndexOf(" ")+1);
        System.out.println("kid3 = " + kid3);
        System.out.println(".......................repeat......................");
        String hobby = " muziek";
        System.out.println("hobby = " + hobby);
        hobby = hobby.repeat(30);
        System.out.println("hobby = " + hobby);
    }
}
