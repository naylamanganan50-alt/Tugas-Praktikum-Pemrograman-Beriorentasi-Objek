public class WordDocument extends Document {

    public WordDocument(String title, int pages) {
        super(title, pages);
    }

    @Override
    public void print() {
        System.out.println(
                "Printing Word Document: " + title + " | Pages: " + pages
        );
    }
}

