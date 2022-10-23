package day30_CustomClassIntro;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.color="White";
        dog1.size="Small";
        System.out.println(dog1);

        Dog dog2= new Dog();
        dog2.name="ACE";
        dog2.breed="Husky";
        dog2.age=3;
        dog2.gender='M';
        dog2.color="Black";
        dog2.size="Large";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");
        System.out.println("dog3 = " + dog3);

        Dog dog4 = new Dog();
        dog3.setInfo("Bullet","Labrador",2,'M',"Extra Large","Yellow");
        System.out.println("dog3 = " + dog3);

        Dog dog5 = new Dog();
        dog3.setInfo("Sully","Pit_Bull",6,'M',"Large","Black");
        System.out.println("dog3 = " + dog3);

        dog1.eat();
        dog2.eat();
        dog3.eat();
        dog1.bark();

        Dog [] dogs= {dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

    }
}
