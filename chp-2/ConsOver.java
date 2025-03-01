class Box {
    double width, height, depth;
    
    // Constructor for a cube
    Box(double side) {
        width = height = depth = side;
    }
    
    // Constructor for a custom box
    // use this here 
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Calculate volume
    double volume() {
        return width * height * depth;
    }
}
public class ConsOver {
    public static void main(String args[])
    {

    }
}
/**
 * class OverloadDemo {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int, int): " + add(5, 10));         // Calls first method
        System.out.println("Sum (int, int, int): " + add(5, 10, 15)); // Calls second method
        System.out.println("Sum (double, double): " + add(5.5, 2.5)); // Calls third method
    }
}

 */