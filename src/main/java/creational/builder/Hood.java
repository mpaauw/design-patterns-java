package creational.builder;

public class Hood implements CarPart {
    @Override
    public CarSystem belongsTo() {
        return CarSystem.EXTERIOR;
    }
}
