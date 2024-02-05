public class BasicAccount extends BaseAccount {
    private double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        super(accountNumber);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public double Withdraw(double amount) {
        double actualWithdrawAmount = Math.min(amount, withdrawalLimit);
        actualWithdrawAmount = Math.min(actualWithdrawAmount, balance);
        if (actualWithdrawAmount > 0) {
            balance -= actualWithdrawAmount;
            return actualWithdrawAmount;
        } else {
            return 0;
        }
    }


}
