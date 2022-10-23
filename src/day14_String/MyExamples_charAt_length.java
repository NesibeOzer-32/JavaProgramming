package day14_String;

public class MyExamples_charAt_length {
    public static void main(String[] args) {
        System.out.println(".......................charAt()....................");
        String name = "nesibe ozer";
        char firstchar = name.charAt(0);
        System.out.println("firstchar = " + firstchar);
        char secondchar = name.charAt(1);
        System.out.println("secondchar = " + secondchar);
        char thirdchar = name.charAt(2);
        System.out.println("thirdchar = " + thirdchar);
        char fourthchar = name.charAt(3);
        System.out.println("fourthchar = " + fourthchar);
        char fifthchar = name.charAt(4);
        System.out.println("fifthchar = " + fifthchar);
        char sixthchar = name.charAt(5);
        System.out.println("sixthchar = " + sixthchar);
        char seventhchar = name.charAt(6);
        System.out.println("seventhchar = " + seventhchar);
        System.out.println(".....................length()...........................");
        int totaalchars = name.length();
        System.out.println("totaalchars = " + totaalchars);
        String word = " Hello my name is Nesibe . I am 31 years old.";
        int totaalchar1 = word.length();
        System.out.println("totaalchar1 = " + totaalchar1);
        String word2 = "Ik ben Nesibe.Ik kom uit Turkije.Ik woon in Nederlands. Ik werk als IT bedrijf werker.";
        int totaalchar3 = word2.length();
        System.out.println("totaalchar3 = " + totaalchar3);
        String schoolname = "Hacettepe University";
        int totaalchar4 = schoolname.length();
        System.out.println("totaalchar4 = " + totaalchar4);
    }
}
