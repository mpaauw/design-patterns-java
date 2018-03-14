package structural.facade.sample;

public class Rater {

    private final double bankFactor = 1.0;
    private final double creditFactor = 1.3;
    private final double backgroundFactor = 1.5;

    public double calculateClientRating(Client client) {
        double financialScore = client.getBank().getAccountBalance() * bankFactor + client.getCredit().getCreditScore() * creditFactor;
        return (client.getBackgroundCheck().isHasCleanHistory()) ? financialScore * backgroundFactor : financialScore / backgroundFactor;
    }

}
