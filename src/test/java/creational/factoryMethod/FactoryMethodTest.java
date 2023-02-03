package creational.factoryMethod;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactoryMethodTest {

    private static AnimalFactory animalFactory;

    @BeforeClass
    public static void setup() {
        animalFactory = new AnimalFactory();
    }

    @Test
    public void factoryMethod_GenerateAnimal_AssertObjectsGeneratedProperly() throws Exception {
        // arrange / act
        final Animal cat = this.animalFactory.generateAnimal(AnimalType.CAT);
        final Animal dog = this.animalFactory.generateAnimal(AnimalType.DOG);
        final Animal fish = this.animalFactory.generateAnimal(AnimalType.FISH);

        // assert
        Assert.assertEquals(cat.getClass(), Cat.class);
        Assert.assertEquals(dog.getClass(), Dog.class);
        Assert.assertEquals(fish.getClass(), Fish.class);
    }

}
