package day37_Inheritance.AnimalTask2;

public class Zoo {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.name="Lucy";
        dog.breed="Husky";
        dog.gender='F';
        dog.age=4;
        dog.size="Large";
        dog.color="White";

        dog.bark();
        dog.sleep();

        Cat cat= new Cat();
        cat.name="Jermy";
        cat.breed="Ragdoll";
        cat.gender='M';
        cat.age=5;
        cat.size="Small";
        cat.color="Gray";

        cat.scratch();
        cat.sleep();

        Fish fish= new Fish();
        fish.name="Nemo";
        fish.breed="Clownfish";
        fish.gender='M';
        fish.age=2;
        fish.size="Small";
        fish.color="GraOrange";

        fish.sleep();
        fish.swim();

        System.out.println("dog = " + dog);

        System.out.println("cat = " + cat);

        System.out.println("fish = " + fish);
    }
}
