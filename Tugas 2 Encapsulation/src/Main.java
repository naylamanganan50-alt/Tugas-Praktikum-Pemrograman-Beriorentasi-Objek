//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Buat 3 akun
        BankAccount acc1 = new BankAccount("A001", "Andi", 1_000_000);
        BankAccount acc2 = new BankAccount("A002", "Budi", 500_000);
        BankAccount acc3 = new BankAccount("A003", "Citra", 750_000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        // Simulasi transaksi
        acc1.deposit(200_000);
        acc2.withdraw(100_000);
        bank.transfer("A001", "A003", 300_000);
        bank.transfer("A003", "A002", 150_000);

        // Cetak saldo akhir
        System.out.println("=== SALDO AKHIR ===");
        System.out.println(acc1.getOwnerName() + ": " + acc1.getBalance());
        System.out.println(acc2.getOwnerName() + ": " + acc2.getBalance());
        System.out.println(acc3.getOwnerName() + ": " + acc3.getBalance());

        // Cetak transaksi
        System.out.println("\n=== RIWAYAT TRANSAKSI A001 ===");
        for (String t : acc1.getTransactions()) {
            System.out.println(t);
        }
    }
}
