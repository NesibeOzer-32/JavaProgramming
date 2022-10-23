package day31_Constructor;

public class StudentObject {
    public static void main(String[] args) {
        Student student1= new Student("Nesibe", 31,'F','A',21043534);
        Student student2= new Student("Ahmet", 28,'M','A',21443534);

        System.out.println(student1);
        System.out.println(student2);
    }
}
