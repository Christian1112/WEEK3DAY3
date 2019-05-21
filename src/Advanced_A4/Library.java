package Advanced_A4;

public class Library {

    private String name;
    private String adress;

    public Library (String name, String adress){

        this.name = name;
        this.adress = adress;

    }

    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getAdress(String adress){
        return adress;
    }
    public void setAdress(){
        this.adress = adress;
    }
}
