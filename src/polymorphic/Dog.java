package polymorphic;

public class Dog extends Animal {

    //Constructor
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " barks: Woof woof !");
    }

    public void bark(){
        System.out.println("The dog is barking.");
    }
}
