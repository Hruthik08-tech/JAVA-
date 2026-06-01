public class TypeCaste {
    public static void main(String[] args)
    {
        double d = 4.555;
        /**
         * Type casting: Explicit way of changing type of a variable 
         * @syntax - (type) <variable_name>
         * @constraints 
         *             - You cannot cast a numeric value to character value 
         */
        int i = (int) d;

        // String s = (String) d;

        System.out.println(i);
    }    
}
