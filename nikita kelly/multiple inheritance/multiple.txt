class multiple {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Fish myFish = new Fish();
        Duck myDuck = new Duck();

        // Using the walk method from Walks interface
        myDog.walk();

        // Using the swim method from Swims interface
        myFish.swim();

        // Using both walk and swim methods in Duck, which implements both interfaces
        myDuck.walk();
        myDuck.swim();
    }
}

interface Walks {
    void walk();
}

// Interface for the second behavior
interface Swims {
    void swim();
}

// Class implementing the first behavior
class Dog implements Walks {
    public void walk() {
        System.out.println("Dog is walking");
    }
}

// Class implementing the second behavior
class Fish implements Swims {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Class implementing both behaviors through multiple interfaces
class Duck implements Walks, Swims {
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

