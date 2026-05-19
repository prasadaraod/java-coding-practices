// Interface demonstrating Abstraction
interface Animal {
    void makeSound();
}

// Parent class demonstrating Inheritance
class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Child class demonstrating Inheritance and Polymorphism
class Dog extends Pet implements Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Child class demonstrating Inheritance and Polymorphism
class Cat extends Pet implements Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class OOPsExample {
    public static void main(String[] args) {
        // Encapsulation and Abstraction in action
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        // Polymorphism
        myDog.makeSound();
        myCat.makeSound();
    }
}
