package creational.abstractFactory;

public class Burrito implements Food {
    @Override
    public void tastesLike() {
        System.out.println("Cheese!");
    }
}
