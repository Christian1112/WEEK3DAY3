package Advanced_A4;

public class Book {

    // Enum method
    public enum Status {
        Available, NotAvailable;
    }

    private static int count = 0;

    private String bookID;
    private String bookTitle;
    private String bookIsbn;
    private double bookPrice;
    private String rentStart;
    private String rentEnd;
    private Status rentStatus;

    public Book(String bookTitle, String bookIsbn, double bookPrice, String rentStart, String rentEnd, Status rentStatus) {
        count++;
        this.bookID = "b" + count;
        this.bookTitle = bookTitle;
        this.bookIsbn = bookIsbn;
        this.bookPrice = bookPrice;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.rentStatus = rentStatus;

    }

    public String getBookID() {
        return this.bookID;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookIsbn() {
        return this.bookIsbn;
    }

    public double getBookPrice() {
        return this.bookPrice;
    }

    public String getRentStart() {
        return rentStart;
    }

    public String getRentEnd() {
        return this.rentEnd;
    }

    public Status getRentStatus() {
        return this.rentStatus;
    }

    public void setBookID(String bookID) {
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
