package exercise1;

/**
 * Represents a Bird, which is a type of Animal.
 * This class extends the Animal class and provides specific implementations
 * for the makeSound and getAnimalType methods.
 * It also keeps track of the number of Bird instances created.
 */
public class Bird extends Animal {
    private static int numberOfBirds = 0;

    /**
     * Makes a sound specific to the Bird.
     */
    public void makeSound() {
        System.out.println("Bird sound");
    }

    /**
     * Gets the type of the animal.
     *
     * @return the type of the animal as a String.
     */
    @Override
    public String getAnimalType() {
        return "Bird";
    }

    /**
     * Gets the total number of Bird instances created.
     *
     * @return the number of Bird instances.
     */
    public static int getNumberOfBirds() {
        return numberOfBirds;
    }

    /**
     * Default constructor for Bird.
     * Increments the number of Bird instances.
     */
    public Bird() {
        super();
        numberOfBirds++;
        System.out.println("Bird constructor called");
    }

    /**
     * Constructor for Bird with a specified name.
     * Increments the number of Bird instances.
     *
     * @param name the name of the bird.
     */
    public Bird(String name) {
        super(name);
        numberOfBirds++;
        System.out.println("Bird Constructor with name called");
    }
}
