
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

class Movie {
    String title;
    String genre;
    Double rating;

    void playIt() {
        System.out.println(title + " " + "Movie is playing");
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


    }
}
