package day14_String;

public class MyExamples_IndexOf_LastIndexOf {
    public static void main(String[] args) {
        System.out.println("....................indexOf()................");
        String name = "Celaleddin Ozer";
        int num = name.indexOf("C");
        System.out.println("num = " + num);
        int num2 = name.indexOf("e");
        System.out.println("num2 = " + num2);
        int num3 = name.indexOf("l");
        System.out.println("num3 = " + num3);
        int num4 = name.indexOf("a");
        System.out.println("num4 = " + num4);
        int num5 = name.indexOf("le");
        System.out.println("num5 = " + num5);
        int num6 = name.indexOf("ed");
        System.out.println("num6 = " + num6);
        System.out.println("...................lastIndexOf().......................");
        int num7 = name.lastIndexOf("r");
        System.out.println("num7 = " + num7);
        int num8 = name.lastIndexOf("e");
        System.out.println("num8 = " + num8);
  
  
  
  
    }
}
