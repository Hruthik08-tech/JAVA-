
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
        // num is a primitive variable 
        int num = 7;

        /**num1 is an object reference (depricated syntax)
        *  Storing a primitive value in an Object is called - boxing
        */
        Integer num1 = new Integer(num);
        
        // Assigning a primitive value to an object reference - Autoboxing 
        Integer num2 = num;

        // Assigning an object reference to a primitive variable - Unboxing
        int num3 = num1.intValue();

        // Assigning an object reference to a primitive variable - Auto Unboxing
        int num4 = num1;
        //
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
