class Book {
    String title;
    String author;
    String isbn;

    void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.title = "Clean Code";
        b1.author = "Robert C. Martin";
        b1.isbn = "101";

        Book b2 = new Book();

        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";
        b2.isbn = "102";

        b1.displayDetails();
        b2.displayDetails();
    }
}