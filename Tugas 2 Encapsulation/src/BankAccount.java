import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private List<String> transactions;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Akun dibuat, saldo awal: " + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposit: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdraw: " + amount);
            return true;
        }
        return false;
    }

    // Digunakan oleh class Bank
    void recordTransaction(String message) {
        transactions.add(message);
    }

    // Encapsulation: kembalikan salinan (tidak bisa diubah)
    public List<String> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}
