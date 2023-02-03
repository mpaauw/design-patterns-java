package creational.factoryMethod;

public class AnimalFactory {

    public Animal generateAnimal(AnimalType animalType) throws Exception {
        switch(animalType) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case FISH:
                return new Fish();
            default:
                throw new Exception("Ahh! New species discovered!");
        }
    }

}
