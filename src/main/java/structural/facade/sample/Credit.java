package structural.facade.sample;

public class Credit {

    private int creditScore;

    public Credit() {}

    public Credit(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
