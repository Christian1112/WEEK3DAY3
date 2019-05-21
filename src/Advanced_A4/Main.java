package Advanced_A4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Library library1 = new Library("Best Library", "Libraryway 01");
        Library library2 = new Library("Read Me", "Thaliastraße 21");
        Library library3 = new Library("Rockafella", "Themstreet2");

        Book book1 = new Book("Lord of the Rings", "12345", 19.50, Book.Status.NotAvailable);
        Book book2 = new Book("Harry Potter", "56789", 15.99, Book.Status.Available);
        Book book3 = new Book("Narnia", "9191919", 9.99, Book.Status.Available);

        LibraryUser user1 = new LibraryUser("Simon", "Home01", 5);
        LibraryUser user2 = new LibraryUser("Christian", "Home02", 2);
        LibraryUser user3 = new LibraryUser("Benjamin", "Home03", 1);

        book1.rentBook();
        
        // Book library



        HashMap<String, Book> books = new HashMap<String, Book>();

        books.put(book1.getBookTitle(), book1);
        books.put(book2.getBookTitle(), book2);
        books.put(book3.getBookTitle(), book3);

        // Array list with different libraries


        HashMap<String, Library> library = new HashMap<String, Library>();

        library.put(library1.getName(), library1);
        library.put(library2.getName(), library2);
        library.put(library3.getName(), library3);
    }





}
