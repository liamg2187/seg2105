package exercise1;

/**
 * Represents a Parrot, which is a type of Bird.
 * This class extends the Bird class and provides specific implementations
 * for the makeSound and getAnimalType methods.
 */
public class Parrot extends Bird {
    /**
     * Makes a sound specific to the Parrot.
     */
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }

    /**
     * Gets the type of the animal.
     *
     * @return the type of the animal as a String.
     */
    @Override
    public String getAnimalType() {
        return "Parrot";
    }

    /**
     * Default constructor for Parrot.
     * Calls the superclass constructor and prints a message.
     */
    public Parrot() {
        super();
        System.out.println("Parrot Constructor called");
    }

    /**
     * Constructor for Parrot with a specified name.
     * Calls the superclass constructor with the specified name and prints a message.
     *
     * @param name the name of the parrot.
     */
    public Parrot(String name) {
        super(name);
        System.out.println("Parrot constructor with name called");
    }
}
