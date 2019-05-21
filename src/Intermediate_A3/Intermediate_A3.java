package Intermediate_A3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intermediate_A3 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        ArrayList<String> apple = new ArrayList<>();
        apple.add("The round fruit of a tree");
        apple.add("Healthy");

        ArrayList<String> stick = new ArrayList<>();
        stick.add("Long brown thing");
        stick.add("Grows on a tree");

        dictionary.put("apple", apple);
        dictionary.put("stick", stick);

        for(Map.Entry<String, ArrayList<String>> word : dictionary.entrySet()) {
            System.out.println("Word: " + word.getKey() + "\nDefiniton: " + word.getValue().get(0)+ "\nMeaning: " + word.getValue().get(1));
            System.out.println("=======================");
        }
    }
}
