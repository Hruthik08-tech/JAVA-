
class A 
{
     
    public A()
    {
        System.out.println("Object: A is created");
    }

    public void show() 
    {
        System.out.println("A showing");
    }

}

class B 
{
    public B() 
    {
        System.out.println("Object: B is created");
    }
    public void show() 
    {
        System.out.println( "B showing");
    }
}


class Computer 
{   


    // declare what you want to do 
    public void playMusic() 
    {
        // define the behaviour 
        System.out.println("Playing music");
    }

    public void stopMusic() 
    {
    System.out.println("Stopped music");    
    }
}

public class BTS 
{
    public static void main(String[] args) 
    {
        Computer c = new Computer();
        c.playMusic();
        c.stopMusic();

        A obj = new A();
        obj.show();

        new B();


    }
}
