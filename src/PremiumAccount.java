public class PremiumAccount extends BaseAccount {

    public PremiumAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double Withdraw(double amount) {
        balance -= amount;
        return amount;
    }
}
