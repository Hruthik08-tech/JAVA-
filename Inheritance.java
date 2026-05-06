class Calc 
{
    public int add(int a, int b) 
    {
        return a + b;
    }
    public int sub(int a, int b)
     {
        return a + b;
     }

}

class AdvCalc extends Calc
{
    public int mult(int a, int b) 
    {
        return a * b;

    }
    public int div(int a, int b)
    {
        return a / b;
    }
}

class SciCalc extends AdvCalc
{
    public double power(int a, int b)
    {
        return Math.pow(a, b);

    }



}

class A extends Object
{
    public A()
    {
        System.out.println("Constructing A...");
    }

    public A(int a)
    {
        System.out.println("Constructin A with param n...");
    }
}

class B extends A 
{
    public B()
    {
        System.out.println("Constructin B...");
    }
    public B(int  n) 
    {
        super(n);
        System.out.println("Constructing B with param n..");
    } 
}

// class C extends A, B
// {

// }

public class Inheritance 
{
    public static void main(String[] args) 
    {
        // Calc c1 = new Calc();
        // AdvCalc c2 = new AdvCalc();

        // System.out.println(c2.add(2, 3));
        // System.out.println(c2.div(5, 4));

        B b1 = new B(30);


    }
}
