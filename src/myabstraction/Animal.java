package myabstraction;

/**
 * An abstract class represents a general concept
 * with common attributes and behaviors, leaving specifics to subclasses.
 */
public abstract class Animal {
    protected  String name;
    protected int age;

    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Abstract Method
    public abstract void makeSound();

    //Concrete method
    public void eat(){
        System.out.println(name + " is eating");
    }

}
