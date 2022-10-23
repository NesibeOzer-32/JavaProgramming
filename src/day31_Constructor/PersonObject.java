package day31_Constructor;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Daniel",'M',32);

        Person person2 = new Person("Melih",'M',35);

        Person person3 = new Person("Ayşe",'F',31);

        person2.name="Murat";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
