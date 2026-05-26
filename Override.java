class A 
{
    public void show() 
    {
        System.out.println("Showing A....");
    }

    public void config()
    {
        System.out.println("Configuring A....");
    }

}

class B extends A 
{
    // overideing show method
    public void show() 
    {
        System.out.println("Showing B....");
    }

    // overide config method 
    public void config()
    {
        System.out.println("Configuring B..");
    }


}

public class Override 
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();
        
    }
}
