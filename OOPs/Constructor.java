package OOPs;

class Car{
    int speed;
    String color;

    //Parameterized constructor
    public Car(int speed, String color){
        this.speed = speed;
        this.color = color;

    }
    // No argument constructor 
    public Car(){
        this.speed = 0;
        this.color = "Unknown";
    }

    public void displayInfo(){
        System.out.println("speed: " + speed  + " Color: " + color);
    }
}
public class Constructor {
    public static void main(String[] args) {

        // usig parameterized constructor
        Car car1 = new Car(100, "Red");
        car1.displayInfo();

        Car car2 = new Car();
        car2.displayInfo();

        
    }
    
}


/*Constructors are special methods used to initialize objects.
They have the same name as the class and no return type.
There are default, parameterized, and no-argument constructors.
Java supports constructor overloading, allowing multiple constructors with different parameter lists in the same class.
Constructors are called automatically when an object is created, making them essential for object initialization. */