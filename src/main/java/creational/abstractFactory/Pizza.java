package creational.abstractFactory;

public class Pizza implements Food {
    @Override
    public void tastesLike() {
        System.out.println("Grease!");
    }
}
