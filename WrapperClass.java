import java.util.ArrayList;

/**
 * Wrapper Class 
 * @description For every primitive type we have a class 
 * @examples 
 *          1. int - Integer
 *          2. char - Character 
 *          3. double - Double 
 * @syntax  Integer num = new Integer(7)
 *         
 * @uses 
 *      
 */

public class WrapperClass 
{
    public static void main(String[] args)
    {   
        Integer iwrap = new Integer(42);
        int iunwrap = iwrap.intValue();
        

        WrapperClass wp = new WrapperClass();
        wp.takeNumber(3);
        System.out.println(wp.giveNumber());

        Boolean t = new Boolean(true);
        if(t) {
            System.out.println("True");
        }


        // Operations on numbers 
        /* The compiler converts the object to it's primitive type before the operation */
        Integer i1 = new Integer(5);
        i1++;
        System.out.println(i1);

        // Assignments 
        /* You can assign either a primitive or wrapper to a variable declared with mathcing wrapper or primitive */
        int i2 = 3;
        int temp;
        temp = i1;
        i1 = i2;
        i2 = temp;
        
        System.out.println(i1);
        System.out.println(i2);
    }

    public void addIntOldWay() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(3));
        list.add(new Integer(5));
        // list.add(5);     This was not there before Java 5.0 
        Integer I1 = (Integer) list.get(0);
        int i1 = I1.intValue();
    }

    public void addIntNewWay() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); // Autoboxing
        list.add(5);
        int i1 = list.get(0); // Unboxing
        System.out.println(i1);
    }

    //Auto Boxing almost works everywhere 
    // Method arguments
    public void takeNumber(Integer i) {
        System.out.println(i);
    }

    public int giveNumber() {
        return new Integer(3);
    }



}
