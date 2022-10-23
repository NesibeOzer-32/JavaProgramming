package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

import day30_CustomClassIntro.Dog;
import day32_Constructor.Car;
import day33_Static.Iphone;
import day33_Static.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        //new GarbageCollection().finalize();
        //finalize: garbage collection use

        /*
        unrefereced:
        ---by nulling the reference(bir datayı hiçbirşeyle tanımlamadım.boş.)

        String str= "Java";
        String str=null;

        ---by assigning a reference to another(başka bir veriyle değiştirdiğim eski bilgi)

        String str ="Java";
        str= "Pyhton";
         */
        String str=null;
        String str2="Wooden Spoon";//ellible for garbage collection
        str2=null;
        System.out.println("str2 = " + str2);

        Car car1= new Car("Toyota");
        //car1=null
        System.out.println("car1 = " + car1);

        System.out.println("..............................................................");
        Dog dog1=new Dog();
        dog1.name="Lucy";//Eligibla for garbage collection after line 32
        new Dog();//Eligibla for garbage collection

        dog1= new Dog();
        dog1.name="MAX";

        System.out.println("dog1 = " + dog1);

        String language="Pyhton";//eligiable for garbage collection
                language="Java";

        System.out.println("language = " + language);

        System.out.println("................................................................");

        ArrayList<Integer>list1= new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 =list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(".................................................................");




    }
}
