import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        BookDB Books = new BookDB("sku123", "melese", "This is it!", "A book about Java programming");
        System.out.println(Books.displayText());

    }
}

