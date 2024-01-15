import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Carte adăugată în bibliotecă: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Carte ștearsă din bibliotecă: " + book.getTitle());
        } else {
            System.out.println("Cartea nu a fost găsită în bibliotecă: " + book.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("Cărți în bibliotecă:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class book {
    public static void main(String[] args) {
        // Creare de instanțe de cărți
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "978-1-234567-89-0");
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", "978-2-345678-90-1");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "978-3-456789-01-2");

        // Creare de instanță de bibliotecă
        Library library = new Library();

        // Adăugare cărți în bibliotecă
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Afișare cărți în bibliotecă
        library.displayBooks();

        // Stergere carte din bibliotecă
        library.removeBook(book2);

        // Afișare cărți actualizată în bibliotecă
        library.displayBooks();
    }
}
