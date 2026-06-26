package Inheritance;

/**
 * Abstraction: Making a class abstract prevents from creating an object of that class. 
 * 
 */

abstract class Animal {
    public String name;
    
    // An abstract method can only be defined in an abstract class. 
    // Not all methods have to be abstract in an abstract class. 
    abstract public void eat();
    abstract public void roam();

}

class Dog extends Animal {
    
    public Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void eat() {
        System.out.println(this.name + " is eating...");
    }

    @Override
    public void roam() {
        System.out.println(this.name + " is roaming...");
    }
}

public class Abstraction  {
    public static void main(String[] args) {


        // You cannot create an object of abstract class
        // Animal a = new Animal();
        Dog d = new Dog("bubbles");
        d.eat();
        d.roam();


    }
}
