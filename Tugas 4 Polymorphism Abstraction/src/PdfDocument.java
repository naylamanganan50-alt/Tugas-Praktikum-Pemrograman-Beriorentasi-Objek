public class PdfDocument extends Document {

    public PdfDocument(String title, int pages) {
        super(title, pages);
    }

    @Override
    public void print() {
        System.out.println(
                "Printing PDF: " + title + " | Pages: " + pages
        );
    }
}
