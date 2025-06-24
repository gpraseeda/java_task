// Demonstration of Method Overloading
class Calculator {

    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Demonstration of Method Overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test everything
public class Polymorphism {
    public static void main(String[] args) {
        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.7));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));

        System.out.println();

        // Method Overriding with Animal reference
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("Animal sound from Dog object:");
        myDog.makeSound();

        System.out.println("Animal sound from Cat object:");
        myCat.makeSound();
    }
}
