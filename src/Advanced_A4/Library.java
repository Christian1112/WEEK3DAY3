package Advanced_A4;

public class Library {

    private String name;
    private String address;

    public Library (String name, String address){

        this.name = name;
        this.address = address;

    }

    public String getName(String name){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public String getAddress(String address){
        return this.address;
    }
    public void setAddress(){
        this.address = address;
    }
}
