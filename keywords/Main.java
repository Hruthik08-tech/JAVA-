package keywords;

class Myclass
{   
    // A public variable can be read/changed by any other class
    public String message = "Hello from my class";

    // A public method can be called from anywhere
    public void printMessage(String message) 
    {
        System.out.println(message);
    }
}

class MathUtils
{
    // Static variables are shared by every intsance of the class
    public static double PI = 3.14159;

    // Static methods can be called without creating a MathUtils class 
    public static int add(int a, int b)
    {
        return a + b;
    }
}

class Blah
{
 
    public void displayPI()
    {
        System.out.println(MathUtils.PI);
    }
    public void displayAdd(int a, int b) 
    {
        System.out.println(MathUtils.add(a, b));
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        // calling MyClass 
        Myclass c1 = new Myclass();
        c1.message = "Hello just changed the message";
        c1.printMessage(c1.message);

        // MathUtils.PI = 3.145678;
        // System.out.println(MathUtils.PI);
        // System.out.println(MathUtils.add(3, 5));

        Blah b = new Blah();
        b.displayAdd(3, 5);
        b.displayPI();
    }
}
