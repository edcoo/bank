    public class StandardAccount extends BaseAccount {

        private double creditLimit;

        public StandardAccount(int accountNumber, double creditLimit) {
            super(accountNumber);
            this.creditLimit = creditLimit > 0 ? 0 : creditLimit;
        }

        @Override
        public double Withdraw(double amount) {
            double actualWithdrawAmount = Math.min(amount, balance - creditLimit);
            if (actualWithdrawAmount > 0) {
                balance -= actualWithdrawAmount;
                return actualWithdrawAmount;
            } else {
                return 0;
            }
        }
    }
