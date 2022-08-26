package day37_Inheritance.AnimalTask2;

public class Animal {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void sleep(){
        System.out.println(name+"is sleeping");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

