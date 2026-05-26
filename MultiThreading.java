class A extends Thread 
{
    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) 
        {
            System.out.println("A");
        }
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class B extends Thread 
{
    // This class is not class but a thread 
    // Each thread should have a run process 
    public void run() 
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) 
        {
            System.out.println("B");
        }
        
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class MultiThreading 
{
    public static void main(String[] args)
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        
        A a = new A();
        B b = new B();


        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        // a.display();
        // b.display();
        a.start();
        b.start();

    
    }     
}
