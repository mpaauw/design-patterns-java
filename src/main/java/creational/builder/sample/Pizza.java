package creational.builder.sample;

/**
 * Describes a class utilizing a simple Builder pattern.
 */
public class Pizza {
    private boolean cheese;
    private boolean meat;
    private boolean sauce;
    private boolean bread;

    private Pizza(Builder builder) {
        cheese = builder.cheese;
        meat = builder.meat;
        sauce = builder.sauce;
        bread = builder.bread;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasMeat() {
        return meat;
    }

    public boolean hasSauce() {
        return sauce;
    }

    public boolean hasBread() {
        return bread;
    }

    public static class Builder {
        private boolean cheese;
        private boolean meat;
        private boolean sauce;
        private boolean bread;

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder meat(boolean meat) {
            this.meat = meat;
            return this;
        }

        public Builder sauce(boolean sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder bread(boolean bread) {
            this.bread = bread;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
