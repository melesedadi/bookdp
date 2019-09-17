public class BookDB {
    private String sku;
    private String author;
    private String title;
    private  String description;

    public BookDB() {
    }

    public BookDB(String sku, String author, String title, String description) {
        this.sku = sku;
        this.author = author;
        this.title = title;
        this.description = description;

    }
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String displayText() {
        String text = "Author:" + getAuthor() + "; Title :" + getTitle() +"; Description:" + getDescription();
        return text;
    }
}
