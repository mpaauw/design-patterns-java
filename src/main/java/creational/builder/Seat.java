package creational.builder;

public class Seat implements CarPart {

    @Override
    public CarSystem belongsTo() {
        return CarSystem.INTERIOR;
    }
}
