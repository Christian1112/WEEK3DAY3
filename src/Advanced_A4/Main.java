package Advanced_A4;

public class Main {
    public static void main(String[] args) {

        Library library1 = new Library("Best Library", "Libraryway 01");

        Book book1 = new Book("Lord of the Rings", "12345", 19.50, "21.05.2019", "25.05.2019", Book.Status.Available);
        Book book2 = new Book("Harry Potter", "56789", 15.99, "15.03.2019", "28.03.2019", Book.Status.Available);
        Book book3 = new Book("Narnia", "9191919", 9.99, "11.03.2019", "22.03.2019", Book.Status.Available);

        LibraryUser user1 = new LibraryUser("Simon", "Home01", 5);
        LibraryUser user2 = new LibraryUser("Christian", "Home02", 2);
        LibraryUser user3 = new LibraryUser("Benjamin", "Home03", 1);
    }
}
