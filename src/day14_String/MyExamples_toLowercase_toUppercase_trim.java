package day14_String;

public class MyExamples_toLowercase_toUppercase_trim {
    public static void main(String[] args) {
        System.out.println("......................toUpperCase()....................");
        String name = "nesibe ozer";
        name = name.toUpperCase();
        System.out.println("name = " + name);
        name = name.toLowerCase();
        System.out.println("name = " + name);
        String centence = "Hello! My name is Nesibe . I live in Haarlem.";
        centence = centence.toUpperCase();
        System.out.println("centence = " + centence);
        System.out.println(".............................toLowerCase()...................");
        centence = centence.toLowerCase();
        System.out.println("centence = " + centence);
        String words = "    pen pencil book noteook   ";
        System.out.println("words = " + words);
        words = words.trim();
        System.out.println("words = " + words);
    }
}
