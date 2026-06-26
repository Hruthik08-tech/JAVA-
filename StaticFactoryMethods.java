

/**
 * Consider static factory methods instead of constructors 
 * static factory method is a static method used to create an object. 
 * Insteading of using traditional `new` keyword with public constructor
 */

//Advantages 
// 1. Improved readability 
// 2. Not required to create a new object each time they are invoked. 


class Dog
{
    public String name;
    public String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public static Dog createBullDog(String name)
    {
        return new Dog(name, "Bull Dog");

    }

}







public class StaticFactoryMethods 
{
    public static void main(String[] args) 
    {

    }
}