package day36_InheritanceOOP2.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        System.out.println(".................................dog..............................................");

        Dog dog= new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();
        System.out.println("dog = " + dog);

        System.out.println(".................................cat..............................................");

        Cat cat= new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println("cat = " + cat);

        System.out.println(".................................Tiger..............................................");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println("tiger = " + tiger);

        //  tiger.bark();




    }

}