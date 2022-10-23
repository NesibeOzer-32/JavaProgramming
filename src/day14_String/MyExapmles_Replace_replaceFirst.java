package day14_String;

public class MyExapmles_Replace_replaceFirst {
    public static void main(String[] args) {
        String email = "kosucunesibe@gmail.com";
        System.out.println("email = " + email);
        email = email.replace("gmail","hotmail");
        System.out.println("email = " + email);
        email = email.replace("kosucunesibe","enesiberat");
        System.out.println("email = " + email);
        email = email.replace("hotmail","gmail");
        System.out.println("email = " + email);
        String words = " hello hallo hello hallo hallo hello hallo";
        words = words.replace("hallo","hello");
        System.out.println("words = " + words);
        String centence = "Java is fun, java is easy.";
        centence = centence.replaceFirst("Java","Phyton");
        System.out.println("centence = " + centence);


    }
}
