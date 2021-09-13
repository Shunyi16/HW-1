/**
 * class MyDog for producing dog's information
 */
public class MyDog {

    /**
     * construct a name object and age object for getting the information from class DogInformation
     * print out the dog's name
     * print out the dog's age
     * @param args
     */
    public static void main(String[] args) {
        DogInformation dog = new DogInformation(null, 0);
        DogInformation age = new DogInformation(null, 0);
        System.out.println("My dog's name is " + dog.name);
        System.out.println("He is " + age.age + " years old");
    }
}
