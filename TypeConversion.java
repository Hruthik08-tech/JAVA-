public class TypeConversion {
    public static void main(String[] args) {
        
        /* The parse methods take string and give back a primitive value*/
        String s = "2";
        int i = Integer.parseInt(s);
        double d = Double.parseDouble(s);
        boolean b = new Boolean("true").booleanValue();

        String t = "two";
        // int i2 = Integer.parseInt(s); NumberFormatException in runtime 

        // Converting a number into a string 
        String doubleString = "" + d;
        String doubleString2 = Double.toString(d);
        

    }
}
