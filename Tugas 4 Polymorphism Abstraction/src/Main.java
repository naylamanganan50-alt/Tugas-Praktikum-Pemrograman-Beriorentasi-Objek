//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Document> documents = new ArrayList<>();

        documents.add(new PdfDocument("Laporan Keuangan", 12));
        documents.add(new WordDocument("Surat Resmi", 3));
        documents.add(new PdfDocument("E-Book Java", 250));

        Printer printer = new Printer();
        printer.printAll(documents);
    }
}
