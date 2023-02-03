package creational.abstractFactory;

public class GreasyStimulatedMealFactory implements AbstractMealFactory {

    @Override
    public Food chomp() {
        return new Pizza();
    }

    @Override
    public Drink chug() {
        return new Coffee();
    }
}
