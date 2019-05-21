package Basic_A2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        HashMap<String, Integer> phoneBook = new HashMap<>();

        phoneBook.put("Christian", 122434);
        phoneBook.put("John", 1234313);
        phoneBook.put("Simon", 6786578);
        phoneBook.put("Benjamin", 786753);

        System.out.println(phoneBook.get("John"));

        boolean checkKey = phoneBook.containsKey("Simon");
        System.out.println(checkKey);

        String checker = "ardgf";
        if(phoneBook.containsKey(checker)){
            System.out.println("Key " + checker + " does exist!");
        } else {
            System.out.println("Key " + checker + " does not exist!");
        }

        for(Map.Entry<String, Integer> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(phoneBook);
        phoneBook.remove("Christian");
        System.out.println(phoneBook);
    }
}
