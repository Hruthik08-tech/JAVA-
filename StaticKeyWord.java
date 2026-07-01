
/**
 * StaticKeyWord: Math class in java has a private constructor, 
 *                therefore no instance of Math object can be created. 
 *               
 *                The keyword static lets a method run without any instance 
 *                of the class. A static method means "behaviour not dependent on an instance variable"
 */


class Song {
    public String title;
    public Song(String title) {
        this.title = title;

    }

    // Regular non static method 
    public void play() {
        // SoundPlayer player = new SoundPlayer();
        // player.playSound(title);
    }

}


class Calculator {

    // static final variables are constants 
    public static final double PI = 3.1453;
    public static final double e = 2.78;
    public static final int FOO;

    // IMP: non-static final variables 
    final int whuffie;
    
    /*
        This code runs as soon as class is loaded, before any static method 
        is called and even before static variable is initalized. 
     */
    static {
        FOO = (int) Math.random();

    }
    
    public Calculator(int whuffie) {
        // Now this cannot be changed again. 
        this.whuffie = whuffie;
    }


}


class Student {
    public int id;
    public int name;


    // A static method cannot make a non-static reference. 
    // public static void display() {
    //     System.out.println("id " + id +
    //                         "name " + name);
    // }
}



public class StaticKeyWord {
    public static void main(String[] args){

    }
}
