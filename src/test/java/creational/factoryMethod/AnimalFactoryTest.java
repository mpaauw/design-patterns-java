package creational.factoryMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnimalFactoryTest {

    private static AnimalFactory animalFactory;

    @BeforeClass
    public static void setup() {
        animalFactory = new AnimalFactory();
    }

    @Test
    public void animalFactory_GenerateAnimal_AssertObjectsGeneratedProperly() throws Exception {
        // arrange / act
        final Animal cat = this.animalFactory.generateAnimal(AnimalType.Cat);
        final Animal dog = this.animalFactory.generateAnimal(AnimalType.Dog);
        final Animal fish = this.animalFactory.generateAnimal(AnimalType.Fish);

        // assert
        Assert.assertEquals(cat.getClass(), Cat.class);
        Assert.assertEquals(dog.getClass(), Dog.class);
        Assert.assertEquals(fish.getClass(), Fish.class);
    }

}
