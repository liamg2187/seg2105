package exercise1;

/**
 * Abstract class representing an Animal.
 * Implements the SoundsMaker interface.
 */
public abstract class Animal implements SoundsMaker {
    private static int numberOfAnimals = 0;
    private String name;

    /**
     * Abstract method to get the type of the animal.
     *
     * @return the type of the animal as a String.
     */
    public abstract String getAnimalType();

    /**
     * Gets the total number of Animal instances created.
     *
     * @return the number of Animal instances.
     */
    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    /**
     * Default constructor for Animal.
     * Increments the number of Animal instances and sets the name to "Unknown Animal".
     */
    public Animal() {
        numberOfAnimals++;
        System.out.println("Animal Constructor called");
        this.name = "Unknown Animal";
    }

    /**
     * Constructor for Animal with a specified name.
     * Increments the number of Animal instances and sets the name to the specified value.
     *
     * @param name the name of the animal.
     */
    public Animal(String name) {
        numberOfAnimals++;
        System.out.println("Animal Constructor with name called");
        this.name = name;
    }

}
