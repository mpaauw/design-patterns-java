package creational.builder;

public class Transmission implements CarPart {
    @Override
    public CarSystem belongsTo() {
        return CarSystem.DRIVETRAIN;
    }
}
