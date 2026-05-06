
class Dog {
    // instance variables 
    int size;
    String breed;
    String name;

    // methods 
    void bark() {
        System.out.println("Woff woff");
    }

}

class Cat {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int sz) {
        size = sz;
    }

    public void meow() {
        System.out.println("Meow Meow");
    }
}
class Movie {
    String title;
    String genre;
    Double rating;

    void playIt() {
        System.out.println(title + " " + "Movie is playing");
    }
}

// this keyword 
class Student {
    String name;
    int age;

    public void printName(String name) {
        name = name; 
        System.out.println(name);
    }

    public void printAge(int age) {
        age = age;
        System.out.println(age);

    }
}

class Human {
    int age;
    String name;

    // constructor looks like a method itself 
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor created");
    }
    public void displayName() {
        System.out.println(this.name);
    }

    public void displayAge() {
        System.out.println(this.age);
    }
}
public class OOP {
    public static void main(String[] args) {

        // Make a Dog object from blueprint defined
        Dog d = new Dog();
        d.size = 40;
        d.breed = "Golden Retriever";
        d.name = "Sprinkles";
        d.bark();

        Movie m = new Movie();
        m.title = "Parasite";
        m.genre = "Thriller";
        m.rating = 9.5;

        m.playIt();

        Cat c = new Cat();
        c.setSize(4);
        // System.out.println(c.getSize());

        Student s = new Student();
        // s.name = "Hruthik";
        // s.age = 18;
        s.printName("Hruthikesh");
        s.printName(s.name);
        s.printAge(s.age);

        Human h = new Human("Hruthikesh", 17);
        // Should display their default values 
        h.displayAge(); 
        h.displayName();

    }
}
