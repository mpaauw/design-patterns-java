package creational.abstractFactory;

public class RefreshingSomewhatNutritiousMealFactory implements AbstractMealFactory {
    @Override
    public Food chomp() {
        return new Burrito();
    }

    @Override
    public Drink chug() {
        return new Water();
    }
}
