class Dog{
    int size;
    String name;

    void bark() {
        System.out.println("Wuff Wuff"); 
    }
}

public class Array {
    public static void main(String[] args) {
        String[] names = {"hruthikesh", "syed", "khushi", "palak"};

        // length of array
        int len = names.length;
        System.out.println(len);

        // looping through array
        for (int i = 0; i < len; i++) {
            System.out.println(names[i]);
        }

        // Declare a dog array variable 
        Dog[] dogs;

        // Create a new dog array with length 5
        dogs = new Dog[5];

        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog();
            
        }

    }
}
