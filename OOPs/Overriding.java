package OOPs;

// This is the example of method overriding

// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    // Overriding the sound() method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myDog = new Dog();        // Animal reference but Dog object
        Animal myCat = new Cat();        // Animal reference but Cat object

        myAnimal.sound();  // Calls the method in Animal class: "Animal makes a sound"
        myDog.sound();     // Calls the method in Dog class: "Dog barks"
        myCat.sound();     // Calls the method in Cat class: "Cat meows"
    }
}
