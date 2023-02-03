package creational.abstractFactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    private AbstractMealFactory factory;

    @Test
    public void abstractFactory_GreasyStimulatedMealFactory_AssertObjectsGeneratedCorrectly() {
        // arrange
        this.factory = new GreasyStimulatedMealFactory();

        // act
        final Food food = this.factory.chomp();
        final Drink drink = this.factory.chug();

        // assert
        Assert.assertEquals(food.getClass(), Pizza.class);
        Assert.assertEquals(drink.getClass(), Coffee.class);
    }

    @Test
    public void abstractFactory_RefreshingSomewhatNutritiousMealFactory_AssertObjectsGeneratedCorrectly() {
        // arrange
        this.factory = new RefreshingSomewhatNutritiousMealFactory();

        // act
        final Food food = this.factory.chomp();
        final Drink drink = this.factory.chug();

        // assert
        Assert.assertEquals(food.getClass(), Burrito.class);
        Assert.assertEquals(drink.getClass(), Water.class);
    }

}
