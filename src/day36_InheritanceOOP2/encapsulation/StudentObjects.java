package day36_InheritanceOOP2.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        System.out.println("student1 = " + student1);
        student1.setName("Ayşe");
        System.out.println("student1 = " + student1);
        student1.setAge(31);
        System.out.println("student1 = " + student1);
    }
}
