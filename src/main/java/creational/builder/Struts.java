package creational.builder;

public class Struts implements CarPart {
    @Override
    public CarSystem belongsTo() {
        return CarSystem.SUSPENSION;
    }
}
