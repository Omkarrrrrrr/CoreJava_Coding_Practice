// Abstraction using abstract class 

package OOPs;

abstract class Shape {
    // abstract method to calculate area
    abstract public double area();

    // Concrete method to display information
    public void display() {
        System.out.println("Calculating area of the shape");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    // Implementation of the abstract area method for Rectangle
    @Override
    public double area() {
        return length * width;
    }
}

    class Circle extends Shape {
        private double radius;
    
        // Constructor to initialize the radius
        public Circle(double radius) {
            this.radius = radius;
        }
    
        // Implementation of the abstract area method for Circle
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
}

public class Abstraction1 {
    public static void main(String[] args) {
        //Creating instance of rectangle and circle
        Shape rectangle = new Rectangle(5,10);
        Shape circle = new Circle(5);

         // Display area of rectangle
         rectangle.display();
         System.out.println("Area of Rectangle: " + rectangle.area());
 
         // Display area of circle
         circle.display();
         System.out.println("Area of Circle: " + circle.area());
    }

}
