

/**
 * Overloading: Is nothing more that having two methods with the same name but different parameters lists. 
 *              Let's you make multiple versions of a method and also vary the access level in any direction. 
 */

class Addition
{
    public int addNums(int a, int b)
    {
        return a + b;
    }

    // You cannot only change the return type of a method to overload it. The parameter list must be different.
    // public double addNums(int a, int b) 
    // {
    //     return a + b;
    // }
    
    public double addNums(double a, double b)
    {
        return a + b;
    }
}



public class OverLoading 
{
    public static void main(String[] args)
    {
        Addition addition = new Addition();

        System.out.println(addition.addNums(1, 2)); // Calls the first method.
        System.out.println(addition.addNums(1.234, 2.0)); // Calls the second method.
    }
}
