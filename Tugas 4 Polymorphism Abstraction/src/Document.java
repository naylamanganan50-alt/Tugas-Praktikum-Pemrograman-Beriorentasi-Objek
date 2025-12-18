public abstract class Document {
    protected String title;
    protected int pages;

    public Document(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // abstract method
    public abstract void print();
}
