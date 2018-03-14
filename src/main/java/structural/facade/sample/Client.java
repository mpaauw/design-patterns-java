package structural.facade.sample;

public class Client {

    private Bank bank;
    private Credit credit;
    private BackgroundCheck backgroundCheck;

    public Client(Bank bank, Credit credit, BackgroundCheck backgroundCheck) {
        this.bank = bank;
        this.credit = credit;
        this.backgroundCheck = backgroundCheck;
    }

    public Bank getBank() {
        return bank;
    }

    public Credit getCredit() {
        return credit;
    }

    public BackgroundCheck getBackgroundCheck() {
        return backgroundCheck;
    }
}
