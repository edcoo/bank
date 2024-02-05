public abstract class BaseAccount implements IAccount{

    protected int accountNumber;
    protected double balance;

    public BaseAccount(int accountNumber) {
        balance=0;
        this.accountNumber = accountNumber;
    }

    @Override
    public void Deposit(double amount) {
        balance += amount;
    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
