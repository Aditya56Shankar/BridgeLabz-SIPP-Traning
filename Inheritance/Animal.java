class AnimalImpl {
    String name;
    int age;

    public AnimalImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends AnimalImpl{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

class Cat extends AnimalImpl{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow~");
    }
}

class Bird extends AnimalImpl{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet tweet!");
    }
}

public class Animal{
    public static void main(String[] args) {
        AnimalImpl cat = new Cat("Whiskers", 2);
        AnimalImpl bird = new Bird("Tweety", 1);
        AnimalImpl dog = new Dog("Buddy", 3);

        dog.makeSound();    
        cat.makeSound();    
        bird.makeSound();
    }
}