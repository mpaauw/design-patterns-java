package creational.builder;

public class Car {

    private CarPart engine;
    private CarPart transmission;
    private CarPart seats;
    private CarPart hood;
    private CarPart struts;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.seats = builder.seats;
        this.hood = builder.hood;
        this.struts = builder.struts;
    }

    public CarPart getEngine() {
        return engine;
    }

    public void setEngine(CarPart engine) {
        this.engine = engine;
    }

    public CarPart getTransmission() {
        return transmission;
    }

    public void setTransmission(CarPart transmission) {
        this.transmission = transmission;
    }

    public CarPart getSeats() {
        return seats;
    }

    public void setSeats(CarPart seats) {
        this.seats = seats;
    }

    public CarPart getHood() {
        return hood;
    }

    public void setHood(CarPart hood) {
        this.hood = hood;
    }

    public CarPart getStruts() {
        return struts;
    }

    public void setStruts(CarPart struts) {
        this.struts = struts;
    }

    public static class CarBuilder {

        private CarPart engine;
        private CarPart transmission;
        private CarPart seats;
        private CarPart hood;
        private CarPart struts;

        public static CarBuilder getInstance() {
            return new CarBuilder();
        }
        public Car build() {
            return new Car(this);
        }

        public CarBuilder buildEngine(CarPart engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder buildTransmission(CarPart transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder buildSeats(CarPart seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder buildHood(CarPart hood) {
            this.hood = hood;
            return this;
        }

        public CarBuilder buildStruts(CarPart struts) {
            this.struts = struts;
            return this;
        }

    }
}
