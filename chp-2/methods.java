// calculate area of circle 
class AreaOfCircle{
    public double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    }
    // Main.java
    public class methods {
        public static void main(String[] args) {
            
            double radius = 3.0;
            AreaOfCircle circle = new AreaOfCircle();
            
            
            double area = circle.calculateArea(radius);
            
    
            System.out.println("The area of the circle is: " + area);
            
         
        }
    }