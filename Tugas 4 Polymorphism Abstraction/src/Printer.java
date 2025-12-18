import java.util.List;

public class Printer {

    public void printAll(List<Document> docs) {
        for (Document doc : docs) {
            doc.print(); // polymorphism
        }
    }
}
