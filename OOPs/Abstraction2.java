
// Abstraction using interface
package OOPs;

interface Vehicle {
    void start();  // Abstract method
    void stop();   // Abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("The car starts.");
    }

    public void stop() {
        System.out.println("The car stops.");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Output: The car starts.
        myCar.stop();   // Output: The car stops.
    }
}