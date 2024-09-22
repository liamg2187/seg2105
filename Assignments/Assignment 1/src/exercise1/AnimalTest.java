package exercise1;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

        // Initialize lists for animal types
        ArrayList<Animal> animalList = new ArrayList<>();
        ArrayList<Mammal> mammalList = new ArrayList<>();
        ArrayList<Bird> birdList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        ArrayList<Parrot> parrotList = new ArrayList<>();

        // Instantiate anonymous classes of Animal
        Animal a1 = new Animal() {
            public void makeSound() {
                System.out.println("Unknown animal sound");
            }

            public String getAnimalType() {
                return "Animal";
            }
        };
        Animal a2 = new Animal() {
            public void makeSound() {
                System.out.println("Unknown animal sound");
            }

            public String getAnimalType() {
                return "Animal";
            }
        };
        Animal a3 = new Animal("a3") {
            public void makeSound() {
                System.out.println("Named animal sound");
            }

            public String getAnimalType() {
                return "Animal";
            }
        };
        Animal a4 = new Animal("a4") {
            public void makeSound() {
                System.out.println("Named animal sound");
            }

            public String getAnimalType() {
                return "Animal";
            }
        };

        // Adding Animals to list
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        // Adding Mammals to list
        mammalList.add(new Mammal());
        mammalList.add(new Mammal());
        mammalList.add(new Mammal("m3"));
        mammalList.add(new Mammal("m4"));
        // Adding Birds to list
        birdList.add(new Bird());
        birdList.add(new Bird());
        birdList.add(new Bird("b3"));
        birdList.add(new Bird("b4"));
        // Adding Dogs to list
        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog("d3"));
        dogList.add(new Dog("d4"));
        // Adding Parrots to list
        parrotList.add(new Parrot());
        parrotList.add(new Parrot());
        parrotList.add(new Parrot("p3"));
        parrotList.add(new Parrot("p4"));

        // Calling makeSound() for all animals
        System.out.println("\nAnimals making sounds:");
        animalList.forEach((n) -> n.makeSound());
        System.out.println("\nMammals making sounds:");
        mammalList.forEach((n) -> n.makeSound());
        System.out.println("\nBirds making sounds:");
        birdList.forEach((n) -> n.makeSound());
        System.out.println("\nDogs making sounds:");
        dogList.forEach((n) -> n.makeSound());
        System.out.println("\nParrots making sounds:");
        parrotList.forEach((n) -> n.makeSound());

        // Printing number of Animals, Mammals, and Birds
        System.out.println("\nTotal number of Animals: " + Animal.getNumberOfAnimals());
        System.out.println("Total number of Mammals: " + Mammal.getNumberOfMammals());
        System.out.println("Total number of Birds: " + Bird.getNumberOfBirds());
    }
}
