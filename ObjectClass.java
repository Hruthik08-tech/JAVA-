class Laptop extends Object
{
    public String model;
    public int price;

    // Even without l.toString() will return 'Hello'
    // public String toString()
    // {
    //     return "Hello";
    // }

}


public class ObjectClass 
{
    public static void main(String[] args) 
    {
        Laptop l = new Laptop();
        l.model = "Asus Vivobook";
        l.price = 234000;

        // by default it class toString() method
        System.out.println(l);
        l.toString();

    
    }
}
