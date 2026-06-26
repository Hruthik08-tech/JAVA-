

import java.util.HashMap;
import java.util.Map;


/**
 * Real World Example 
 * 1. Massive multiplayer online games (MMOGs) often have thousands of players interacting in a shared virtual world.
 *    Each player in the map sees trees, rocks, and other objects. 
 *    Instead of creating a separate object for each tree or rock, the game can use the Flyweight pattern to share common data (like the appearance of a tree) 
 *    while maintaining unique state (like the position of each tree).
 */

/**
 * Definition:
 * The Flyweight pattern reduces memory usage by sharing objects 
 * It uses a factory to manage these shared objects, and ensures that each 
 * object is created only once and reused whenever needed.
 * 
 */

/**
 * When to use Flyweight pattern:
 * 1. When an application needs to create a large number of similar objects that consume a lot of memory.
 */

// Displaying circles of different colors and sizes on a screen.
interface Circle
{
    void draw();
    void setPosition(int x, int y);

}


class ConcreteCircle implements Circle
{
    private String color;
    private int x;
    private int y;

    public ConcreteCircle(String color)
    {
        this.color = color;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ")");
    }

    @Override
    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}


class CircleFactory
{
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color)
    {
        Circle circle = circleMap.get(color);
        if (circle == null)
        {
            circle = new ConcreteCircle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a " + color + " circle");

        }
        return circle;
    }
}



public class FlyWeight 
{
    public static void main(String[] args) 
    {
        final String[] colors = {"Red", "Green", "Red", "Yellow", "Black"};
        final int[] positionsX = {10, 20, 30, 40, 50};
        final int[] positionsY = {10, 20, 30, 40, 50};

        for (int i = 0; i < colors.length; i++)
        {
            Circle circle = CircleFactory.getCircle(colors[i]);
            circle.setPosition(positionsX[i], positionsY[i]);
            circle.draw();
        }

    }
}
