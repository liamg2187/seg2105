package exercise1;

/**
 * The SoundsMaker interface provides a contract for any class that wants to implement
 * the ability to make a sound. Classes implementing this interface must provide an
 * implementation for the makeSound method.
 */
public interface SoundsMaker {
    /**
     * Makes a sound. Classes implementing this method should provide the specific
     * sound that the object makes.
     */
    void makeSound();
}
