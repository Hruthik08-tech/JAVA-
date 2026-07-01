import java.util.ArrayList;

/**
 * Every class in Java is a subclass of Object class.  
 */
class Laptop extends Object
{
    public String model;
    public int price;

    public Laptop(String model, int price) 
    {
        this.model = model;
        this.price = price;
    }

    public void display() 
    {
        System.out.println("Model: " + model + ", Price: " + price);
    }

}

class Computer extends Object
{
    public String model;
    public int price;

    public Computer(String model, int price) 
    {
        this.model = model;
        this.price = price;
    }

    public void display() 
    {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class ObjectClass 
{
    public static void main(String[] args) 
    {

        ArrayList<Object> list = new ArrayList<Object>();
        Laptop l1 = new Laptop("Dell", 50000);
        Laptop l2 = new Laptop("HP", 60000);
        Computer c1 = new Computer("Lenovo", 40000);
        Computer c2 = new Computer("Asus", 70000);

        list.add(l1);
        list.add(l2);   
        list.add(c1);
        list.add(c2);

        // list.get(0).display();
        // This is not possible cause the reference of all the objects in the list is of type Object class. 
        // And Object class has no method called display(). 

        // Typecasing 
        Computer c = (Computer) list.get(2);
        c.display();
    }
}
