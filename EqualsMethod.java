



/* The perfect equals method 
    Write a unit test to check if the equals method is working correctly 
     - Reflexive 
     - Symmetric
     - Consistent
*/


class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {   
        // Fast check if both references point to same memory address 
        if (this == o)
        {
            return true;
        }

        // Use the instance of operator to check if the argument is off correct type 
        if (!(o instanceof Person))
        {
            return false;
        }

        // Cast the arguument to correct type 
        Person p = (Person) o;

        // Check each field in the object 
        return p.name == this.name && p.age == this.age;
    }

}


class Dog
{
    String name;

    public Dog(String name)
    {
        this.name = name;
    }
}


public class EqualsMethod 
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Buddy");
        
        // A new string object "Hello World" is created and n1 and n2 point towards same object
        String n1 = "Hello World";
        String n2 = "Hello World";

        // Java engineers override the string method inside the String class
        String a1 = new String("Hello World");
        String a2 = new String("Hello World");

        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));

        // Under the hood it checks if both these unqiue addresses match? (==)
        // Which is checking if both share same memory location 
        System.out.println(d1.equals(d2));
        System.out.println(n1.equals(n2));
        System.out.println(a1.equals(a2));

    }
}




