
/**
 * Interfaces: They solve the DDD, by making all the methods abstract. 
 *             So the first concrete class must define all the abstract methods.
 *             JVM is not confused about which superclass to choose from. 
 *
 * Advantages: Classes from different inheritance trees can implement the same interface. 
 */

abstract class Animal {
    
    public String name;

    abstract public void eat();
    abstract public void sleep();

}

interface Pet {
    
    abstract public void play();

}

// When you implement an interface you still get to  extend a class. 
class Dog extends Animal implements Pet {

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public void eat() {
        System.out.println(this.name + " is eating...");
    }

    @Override
    public void sleep() {
        System.out.println(this.name +  " is sleeping..");
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing...");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        Dog d = new Dog("Spooon");
        d.eat();
        d.play();

        Pet p = new Dog("Bubbles");
        // p.eat(); //This method doesn't exists in interface Pet
        p.play();

        Animal a = new Dog("Stinker");
        a.eat();
        a.sleep();


    }    
}
