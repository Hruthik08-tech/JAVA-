class A extends Object
{
    public void showA() 
    {
        System.out.println("Showing A..");
    }
}

class B extends A
{
    public void showB()
    {
        System.out.println("Showing B...");
    }
}

public class UpCaste {
    public static void main(String[] args)
    {
        A a1 = new A();
        B b1 = new B();
        /**
         * As B extends A
         * B knows the information i.e instance variables, methods that A holds
         * But A doesn't have information i.e instance variables, methods that B holds 
         */
        a1.showA();
        b1.showA();

        /**
         * Using Dynamic Method Dispatch
         * @description Mechanism by which Java resolves a call to an 
         *              overridden method at runtime rather than compile time.
         * 
         * @syntax Both the statements written below are DMD 
         * 
         */
        A obj = (A) new B();
        A obj1 = new B();
        obj.showA();

    }
}
