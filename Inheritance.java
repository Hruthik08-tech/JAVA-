
import java.util.Scanner;


class Animal
{
    public String name;

    void eat(Animal a) { System.out.println(a.name + " is eating.."); }
    void roam(Animal a) { System.out.println(a.name + " is roaming.."); }
    void run(Animal a) { System.out.println(a.name + " is running.."); }
    void makeNoise() {}
}

final class Dog extends Animal
{

    public Dog(String name)
    {
        this.name = name;

    }

    @Override
    void makeNoise()
    {
        System.out.println("Woof Woof");

    }

}

// ZooKeeper has a Animal
class ZooKeeper
{
    /* Polymorphism: Passing the superclass as argument we can pass any of it's subclass 
       without creating a method for each animal. */
    void treat(Animal a)
    {
        System.out.println("Treating.. " + a.name);

    }

}



final class Lion extends Animal
{
    public Lion(String name)
    {
        this.name = name;
    }

    @Override
    void makeNoise()
    {
        System.out.println("Rooaaaar... ");

    }

}



public class Inheritance 
{
    public static void main(String[] args) 
    {

        // Dog d = new Dog("Spoons");
        // Lion l = new Lion("Simba");
        // d.roam(d);
        // l.roam(l);
        // d.makeNoise();
        // l.makeNoise();

        //Polymorphic arrays. 
        Animal[] animals = new Animal[5];
        Scanner scanner =  new Scanner(System.in);


        for(int i = 0; i < animals.length; i++)
        {
            if(i % 2 == 0) 
            {
                System.out.println("Enter your dog's name: ");
                String dogName = scanner.nextLine();
                animals[i] = new Dog(dogName);

            }
            else
            {
                System.out.println("Enter your lion's name: ");
                String lionName = scanner.nextLine();
                animals[i] = new Lion(lionName);

            }
        }
        scanner.close();

        for(int i = 0; i < animals.length; i++)
        {
            animals[i].roam(animals[i]);
            animals[i].makeNoise();
        }



    }
}
