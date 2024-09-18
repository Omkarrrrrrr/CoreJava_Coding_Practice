package OOPs;


class Car {
    // Static variable
    static int numberOfCars = 0;
    
    String color;
    
    // Constructor
    public Car(String color) {
        this.color = color;
        numberOfCars++;  // Increments every time a new Car object is created
    }
    
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
    public static void displayNumberOfCars() {
        System.out.println("Number of cars: " + numberOfCars);
    }
}
public class Static {
    public static void main(String[] args) {
        Car car1 = new Car("Red");
        Car car2 = new Car("Blue");
        
        car1.displayInfo();
        car2.displayInfo();
        
        Car.displayNumberOfCars();  // Accessing static method without an instance
    }
    
}







/*The static keyword is used to define class-level members.
Static members (variables, methods) are shared among all instances and can be accessed using the class name.
Static blocks are used for static initialization and run when the class is loaded.
Static nested classes can be accessed without an instance of the outer class.
 */