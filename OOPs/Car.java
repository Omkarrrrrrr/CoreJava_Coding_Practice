// Instance variables: When each object needs its own copy of the variable
// Local variables: When a temporary variable is needed inside a method..
// Static variables: When a common property across all instances of a class is needed.
package OOPs;



public class Car {
    int speed; //instance variable

    public void start(){
        int fuel = 10;   //Local variable
        System.out.println(fuel);
    }
    static int wheels = 4;  // Static variable shared by all instances of the class
    public static void main(String[] args) {
        
         // Creating the first Car object
        Car car1 = new Car();
        car1.speed = 100;   // Setting the speed for car1


        // Creating the second Car object
        Car car2 = new Car();
        car2.speed = 200;   //Setting the speed for car2

        // Display the speed of both cars
        System.out.println("Car1 speed is: " + car1.speed);
        System.out.println("Car2 sped is : "+ car2.speed);

        Car myCar = new Car();  // Create an object of Car
        myCar.start();  // Call the start method

        System.out.println(Car.wheels);  // Accessing the static variable using the class name

    }
}


/*Package Declaration: Ensure the top of your Car.java file contains this:

java
Copy code
package OOPs;
Correct Command to Compile:

bash
Copy code
javac OOPs/Car.java
Correct Command to Run: After compilation, run the class using the fully qualified name (with the package):

bash
Copy code
java OOPs.Car */