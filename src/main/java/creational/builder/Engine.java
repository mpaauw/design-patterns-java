package creational.builder;

public class Engine implements CarPart {
    @Override
    public CarSystem belongsTo() {
        return CarSystem.POWERTRAIN;
    }
}
