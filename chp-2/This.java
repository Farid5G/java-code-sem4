class Rectangle {
    int length;
    int width;
    // change this to parameterized constructor
    public void setDimensions(int length, int width) {
        this.length = length;  
        this.width = width;    
    }
    public void area(){
        System.out.println("Area of the rectangle is: "+this.length * this.width);
    }
}

public class This {
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        rect.setDimensions(3,5);
        rect.area();
    }
}

// this.length refers to the instance variable, differentiating it from the parameter

// Without this, the code would assign the parameter to itself, leaving instance variables unchanged