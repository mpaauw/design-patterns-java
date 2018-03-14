package structural.facade.sample;

public class Bank {

    private double accountBalance;

    public Bank() {}

    public Bank(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
