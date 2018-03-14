package structural.facade.sample;

public class LoanApprover {

    private final double threshold = 100000;

    private Rater rater;

    public LoanApprover() {
        rater = new Rater();
    }

    public boolean approveClient(Client client) {
        return rater.calculateClientRating(client) >= threshold;
    }

}
