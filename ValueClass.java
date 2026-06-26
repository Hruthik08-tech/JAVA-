


/**
 * A value class is a class designed purely to hold data. For these classes, 
 * the identity of the object (its memory address) does not matter; 
 * only the values inside it matter.
 */
class Point
{
    public int x;
    public int y;

    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //@Override public boolean equals(Object o)
}



public class ValueClass {
    public static void main(String[] args)
    {
        // Why point is a value class?
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        System.out.println(p1 == p2); // false, because they are different objects in memory
        System.out.println(p1.equals(p2)); // false, because the default equals method compares memory addresses
        


    }
}
