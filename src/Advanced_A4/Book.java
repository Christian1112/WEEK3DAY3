package Advanced_A4;

public class Book {

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


}
