import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void transfer(String fromAcc, String toAcc, double amount) {
        BankAccount from = accounts.get(fromAcc);
        BankAccount to = accounts.get(toAcc);

        if (from == null || to == null) {
            System.out.println("Transfer gagal: akun tidak ditemukan");
            return;
        }

        if (from.withdraw(amount)) {
            to.deposit(amount);
            from.recordTransaction("Transfer ke " + toAcc + ": " + amount);
            to.recordTransaction("Transfer dari " + fromAcc + ": " + amount);
        } else {
            System.out.println("Transfer gagal: saldo tidak cukup");
        }
    }

    public BankAccount getAccount(String accNumber) {
        return accounts.get(accNumber);
    }
}

