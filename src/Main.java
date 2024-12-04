import myabstraction.Animal;
import myabstraction.Elephant;
import myabstraction.Lion;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Bart", 3));
        animals.add(new Elephant("Sam", 1));

        for(Animal animal : animals){
            animal.makeSound();
            System.out.println();
        }

//        PolymorphismDemo poly = new PolymorphismDemo();
//      //  poly.demoPoly();
//        poly.useInstanceOf();
//
//        // Upcasting A subclass object is treated as an instance of its superclass.
//
//        polymorphic.Animal animal = new polymorphic.Dog("Buddy" , 3);//Upcasting
//        animal.makeSound();
//
//        polymorphic.Animal animal1 = new polymorphic.Cat("Munga" , 2);//Upcasting
//        animal1.makeSound();

     //DownUpcasting
        // A superclass reference is explicitly cast to subclass type.

//        Animal animal2 = new Dog("Max", 5); //Upcasting
//        Animal animal3 = new Cat("MyCat", 3); //Upcasting
//        Dog dog = (Dog) animal2;  //Downcasting
//        Cat cat = (Cat) animal3;
//
//        cat.makeSound();
//        dog.bark();
//        dog.makeSound();



    }
}