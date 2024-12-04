import polymorphic.Animal;
import polymorphic.Cat;
import polymorphic.Dog;

import java.util.ArrayList;

public class PolymorphismDemo {

    //Create a list of animals
    ArrayList<Animal> animals = new ArrayList<>();

    public void demoPoly(){
        animals.add(new Dog("Buddy", 3));
        animals.add(new Cat("Munga", 2));
        animals.add(new Animal("Generic polymorphic.Animal", 5)); //Parent class object

        //Demonstrate polymorphic behavoir

        for(Animal animal : animals){
            animal.makeSound();  //Calls the appropriate version of makeSound() method
            animal.eat(); //Call to the common eat method
            System.out.println();
        }


    }

    public void useInstanceOf(){
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Munga", 2);
        Animal myAnimal = new Animal("Generic polymorphic.Animal", 5);

        System.out.println(myAnimal instanceof Animal);
        System.out.println(myAnimal instanceof Dog);
        System.out.println(myDog instanceof Dog);
        System.out.println(myDog instanceof Animal);
    }
}
