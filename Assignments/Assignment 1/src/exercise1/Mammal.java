package exercise1;

/**
 * Represents a Mammal, which is a type of Animal.
 * This class extends the Animal class and provides specific implementations
 * for the makeSound and getAnimalType methods.
 * It also keeps track of the number of Mammal instances created.
 */
public class Mammal extends Animal {
    private static int numberOfMammals = 0;

    /**
     * Makes a sound specific to the Mammal.
     */
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    /**
     * Gets the type of the animal.
     *
     * @return the type of the animal as a String.
     */
    @Override
    public String getAnimalType() {
        return "Mammal";
    }

    /**
     * Gets the total number of Mammal instances created.
     *
     * @return the number of Mammal instances.
     */
    public static int getNumberOfMammals() {
        return numberOfMammals;
    }

    /**
     * Default constructor for Mammal.
     * Increments the number of Mammal instances.
     */
    public Mammal() {
        super();
        numberOfMammals++;
        System.out.println("Mammal constructor called");
    }

    /**
     * Constructor for Mammal with a specified name.
     * Increments the number of Mammal instances.
     *
     * @param name the name of the mammal.
     */
    public Mammal(String name) {
        super(name);
        numberOfMammals++;
        System.out.println("Mammal Constructor with name called");
    }
}
