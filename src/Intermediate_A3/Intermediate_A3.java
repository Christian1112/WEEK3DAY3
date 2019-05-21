package Intermediate_A3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intermediate_A3 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        ArrayList<String> items = new ArrayList<>();

        items.add("The round fruit of a tree");
        items.add("Healthy");
        items.add("Long brown ting");
        items.add("Falls down from a tree");



        dictionary.put("apple", items);
        dictionary.put("stick", items);

        for(Map.Entry<String, ArrayList<String>> word : dictionary.entrySet()) {
            System.out.println("Word: " + word.getKey() + " Definiton: " + word.getValue().get(0)+ " Meaning: " + word.getValue().get(1));
        }

        for(int i = 0; i < dictionary.size(); i++) {
            System.out.println("Word: " + dictionary.getKey(i) + " Definiton: " + dictionary.getValue(i).get(0)+ " Meaning: " + word.getValue().get(1)););
        }
    }
}
