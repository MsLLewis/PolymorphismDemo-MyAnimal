package polymorphic;

public class Animal {

   protected String name;
   protected int age;

    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method can be overriden by subclasses
    public void makeSound(){
        System.out.println(name + "  makes a generic animal sound. ");
    }

    public void eat(){
        System.out.println(name + " is eating. ");
    }
}
