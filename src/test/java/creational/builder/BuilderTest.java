package creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void builder_Car_AssertEmptyObjectInstantiatedCorrectly() {
        // arrange
        final Car.CarBuilder builder = Car.CarBuilder.getInstance();

        // act
        final Car car = builder.build();

        // assert
        Assert.assertNull(car.getEngine());
        Assert.assertNull(car.getTransmission());
        Assert.assertNull(car.getStruts());
        Assert.assertNull(car.getHood());
        Assert.assertNull(car.getSeats());
    }

    @Test
    public void builder_Car_AssertPartialObjectInstantiatedCorrectly() {
        // arrange
        final Car.CarBuilder builder = Car.CarBuilder.getInstance()
                .buildEngine(new Engine())
                .buildTransmission(new Transmission())
                .buildStruts(new Struts());

        // act
        final Car car = builder.build();

        // assert
        Assert.assertNotNull(car.getEngine());
        Assert.assertNotNull(car.getTransmission());
        Assert.assertNotNull(car.getStruts());
        Assert.assertNull(car.getHood());
        Assert.assertNull(car.getSeats());
    }

    @Test
public void builder_Car_AssertFullObjectInstantiatedCorrectly() {
        // arrange
        final Car.CarBuilder builder = Car.CarBuilder.getInstance()
                .buildEngine(new Engine())
                .buildTransmission(new Transmission())
                .buildStruts(new Struts())
                .buildHood(new Hood())
                .buildSeats(new Seat());

        // act
        final Car car = builder.build();

        // assert
        Assert.assertNotNull(car.getEngine());
        Assert.assertNotNull(car.getTransmission());
        Assert.assertNotNull(car.getStruts());
        Assert.assertNotNull(car.getHood());
        Assert.assertNotNull(car.getSeats());
    }

}
