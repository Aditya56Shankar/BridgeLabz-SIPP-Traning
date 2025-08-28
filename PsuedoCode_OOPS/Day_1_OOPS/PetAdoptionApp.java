// Base Class
class Pet {
    protected String name;
    protected int age;

    // Constructor
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Dog subclass
class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // call Pet constructor
        this.breed = breed;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Breed: " + breed);
    }
}

// Cat subclass
class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Color: " + color);
    }
}

// Bird subclass
class Bird extends Pet {
    private String species;

    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Species: " + species);
    }
}
public class PetAdoptionApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "White");
        Bird bird = new Bird("Tweety", 1, "Parrot");

        System.out.println("--- Dog Details ---");
        dog.displayDetails();

        System.out.println("\n--- Cat Details ---");
        cat.displayDetails();

        System.out.println("\n--- Bird Details ---");
        bird.displayDetails();
    }
}
