import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank implements IBank {
    private final List<IAccount> accounts = new ArrayList<>();

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        Optional<IAccount> accountOpt = accounts.stream()
                .filter(a -> a.GetAccountNumber() == accountNumber)
                .findFirst();

        if (accountOpt.isPresent()) {
            IAccount account = accountOpt.get();
            if (account.GetCurrentBalance() >= 0) {
                accounts.remove(account);
            } else {
                System.out.println("Account not closed due to debt.");
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> Accountindebt=new ArrayList<>();
        for (IAccount account:accounts) {
            if (account.GetCurrentBalance()<0){
                Accountindebt.add(account);
            }

        }
        return Accountindebt;


    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> Acountwithbalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() >= balanceAbove) {
                Acountwithbalance.add(account);
            }

        }
        return Acountwithbalance;
    }
}
