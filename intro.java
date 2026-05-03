// We type code file with .java extension, then compile it into new class file with .class file extension 
// 

public class Intro {
    // main() is a method inside intro class 
    public static void main (String[] args) {
        System.out.println("Hello World");

        int x = 3;
        String name = "Hruthikesh";

        System.out.println(x);
        System.out.println(name);

        // while loop 
        int i = 0;
        while (i < 7) {
            System.out.println(i);
            i += 1;
        }

        // conditions 
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    }
}