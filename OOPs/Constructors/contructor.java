class Book {
    String title;
    String author;
    String isbn;
//this.title refers to the instance variable belonging to the current object.
//title refers to the constructor parameter.
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayDetails() {
        System.out.println(title + " by " + author);
    }
}