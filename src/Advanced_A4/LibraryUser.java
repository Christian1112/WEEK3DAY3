package Advanced_A4;

public class LibraryUser {

    private String userId;
    private String name;
    private String address;
    private int booksRented;

    private static int count = 0;

    public LibraryUser(String name, String address, int booksRented){
        count++;
        this.userId = "u" + count;
        this.name = name;
        this.address = address;
        this.booksRented = booksRented;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBooksRented() {
        return this.booksRented;
    }

    public void setBooksRented(int booksRented) {
        this.booksRented = booksRented;
    }
}
