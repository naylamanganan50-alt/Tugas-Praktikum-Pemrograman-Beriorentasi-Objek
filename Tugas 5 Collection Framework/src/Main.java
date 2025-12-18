//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();

        repo.add(new Student("S1", "Andi", 3.5));
        repo.add(new Student("S2", "Budi", 3.2));

        repo.update("S1", "Andi Wijaya", 3.8);
        repo.remove("S2");

        System.out.println("=== LOG TRANSAKSI ===");
        for (String log : repo.getLogs()) {
            System.out.println(log);
        }

        // Baris ini akan ERROR (encapsulation aman)
        // repo.getLogs().add("HACK");
    }
}
