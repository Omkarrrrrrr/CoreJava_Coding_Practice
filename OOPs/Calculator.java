package OOPs;

// Here is the example of method overloading

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

      Calculator calc = new Calculator();
      System.out.println(calc.add(5,10));
      System.out.println(calc.add(5, 10, 15));
      System.out.println(calc.add(5.5, 34.5));

    }
}