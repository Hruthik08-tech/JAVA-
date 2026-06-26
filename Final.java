

//final - variable, method, class 

// Class
// Making a class final we are stopping inheritance 

class  Calculator
{
    // Method 
    // Making a method final will prevent method over-riding
    public void show()
    {
        System.out.println("Showing Calculator");
    }
    public void add(int a, int b)
    {
        System.out.println(a + b);

    }

}

final class AdvCalculator extends Calculator
{
    public void show()
    {
        System.out.println("Showing AdvCalaculator");

    }
}

// class SciCalculator extends AdvCalculator
// {

// }

public class Final 
{
    public static void main(String[] args) 
    {
        
        // Variable 
        // Adding final to a variable makes it constant 
        final int num = 8;
        final double PI = 3.14;

        
    }
}
