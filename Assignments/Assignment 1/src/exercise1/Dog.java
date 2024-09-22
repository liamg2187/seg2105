package exercise1;

/**
 * Represents a Dog, which is a type of Mammal.
 * This class extends the Mammal class and provides specific implementations
 * for the makeSound and getAnimalType methods.
 */
public class Dog extends Mammal {
    /**
     * Makes a sound specific to the Dog.
     */
    @Override
    public void makeSound() {
        System.out.println("Bark bark!");
    }

    /**
     * Gets the type of the animal.
     *
     * @return the type of the animal as a String.
     */
    @Override
    public String getAnimalType() {
        return "Dog";
    }

    /**
     * Default constructor for Dog.
     * Calls the superclass constructor and prints a message.
     */
    public Dog() {
        super();
        System.out.println("Dog Constructor called");
    }

    /**
     * Constructor for Dog with a specified name.
     * Calls the superclass constructor with the specified name and prints a message.
     *
     * @param name the name of the dog.
     */
    public Dog(String name) {
        super(name);
        System.out.println("Dog constructor with name called");
    }
}
