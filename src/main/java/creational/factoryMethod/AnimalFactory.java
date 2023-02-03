package creational.factoryMethod;

public class AnimalFactory {

    public Animal generateAnimal(AnimalType animalType) throws Exception {
        switch(animalType) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Fish:
                return new Fish();
            default:
                throw new Exception("Ahh! New species discovered!");
        }
    }

}
