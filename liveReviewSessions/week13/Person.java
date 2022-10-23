package week13;

public class Person {
    public String firstName,lastName;
    private int age;
    private static String planet="Earth";

    public Person(){//Default NO parameter constructor
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public String getPlanet(){
        return planet;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1=new Person("Nesibe","Ozer",31);

        System.out.println(person1.getFirstName() + " live in " +person1.getPlanet());

        //person1.setFirstName()----Does not exist: set kurmadık
    }
}
