package OOPs;

// Parent class
class Vehicle{
    String brand = "Ford"; //Field (instance variable)

    public void horn(){
        System.out.println("Beep beep!!!");
    }

}

// Child class that inherits from vehicle

class Car extends Vehicle{
    String model = "Mustang";

    public void displayInfo(){
        System.out.println("Brand: " + brand);   //Inherited field
        System.out.println("Model: " + model);  //child class field
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.horn();    // Call the inherited method from Vehicle
        mycar.displayInfo(); //Call the method from car
    }
}
