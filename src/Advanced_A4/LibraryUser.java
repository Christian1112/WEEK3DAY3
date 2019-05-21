package Advanced_A4;

public class LibraryUser {

    private int userId;
    private String name;
    private String address;
    private int booksRented;

    public LibraryUser(int userId, String name, String address, int booksRented){
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.booksRented = booksRented;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
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
