package Advanced_A4;

public class Book {

    // Enum method
    public enum Status {
        Available, NotAvailable;
    }

    private int bookID;
    private String bookTitle;
    private String bookIsbn;
    private double bookPrice;
    private String rentStart;
    private String rentEnd;
    private Status rentStatus;


    public Book(int bookID, String bookTitle, String bookIsbn, double bookPrice, String rentStart, String rentEnd, Status rentStatus) {

        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookIsbn = bookIsbn;
        this.bookPrice = bookPrice;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.rentStatus = rentStatus;

    }

    public int getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getRentStart() {
        return rentStart;
    }

    public String getRentEnd() {
        return rentEnd;
    }

    public Status getRentStatus() {
        return rentStatus;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setRentStart(String rentStart) {
        this.rentStart = rentStart;
    }

    public void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }

    public void setRentStatus(Status rentStatus) {
        this.rentStatus = rentStatus;
    }
}
