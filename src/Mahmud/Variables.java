package Mahmud;

// 1. Local Variables
// Local variables are defined within methods, constructors, or blocks. They are created when the method is called and destroyed once it exits.
class Car {
    String brand; // Instance variable

    public void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

class Car2 {
    static int wheels = 4; // Static variable

    public static void displayWheels() {
        System.out.println("Number of wheels: " + wheels);
    }
}

public class Variables {
    public static void main(String[] args) {
        int localVar = 10; // Local variable
        System.out.println("Local Variable: " + localVar);
        Car2.displayWheels(); // Accessing static variable directly through the class
        Car myCar = new Car();       // Creating an object
        myCar.brand = "Toyota";      // Assigning value to the instance variable
        myCar.displayBrand();        // Output: Car Brand: Toyota
    }
}


