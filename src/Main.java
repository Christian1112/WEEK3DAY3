import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> nameOfDogs = new HashMap<>();

        nameOfDogs.put("Austria", "Schäferhund");
        nameOfDogs.put("Canada", "Huskey");
        nameOfDogs.put("America", "Labrador");
        nameOfDogs.put("Mexico", "Chihuahua");
        nameOfDogs.put("Germany", "Dackel");

        System.out.println(nameOfDogs.get("America"));

        boolean searchForKey = nameOfDogs.containsKey("America");
        System.out.println(searchForKey);

        boolean searchForValue = nameOfDogs.containsValue("Schäferhund");
        System.out.println(searchForValue);

        System.out.println(nameOfDogs.size());

        //nameOfDogs.clear();
       // System.out.println(nameOfDogs.size());

        Iterator iterates = nameOfDogs.entrySet().iterator();
        while(iterates.hasNext()){
            Map.Entry<String, String> pair = (Map.Entry<String, String>) iterates.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

        for(Map.Entry entry : nameOfDogs.entrySet()){
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            System.out.println(key + " " + value);
        }

        for (Map.Entry<String, String> entry : nameOfDogs.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }





        /*A1: Worm-up: Create a HashMap object and demonstrate following procedures:
add key-value pairs to HashMap (String, pointing to String)
retrieve a value associated with a given key from the HashMap
check whether a particular key/value exist in a HashMap
find out the number of key-value mappings present in a HashMap
remove all key-value pairs from a HashMap
Iterate through all key-value pairs and print them
remove a key-value pair
replace a value associated with a given key
replace a value associated with the given key if and only if it is currently mapped to given value (note: research different implementation of replace() method)
*/



    }
}
