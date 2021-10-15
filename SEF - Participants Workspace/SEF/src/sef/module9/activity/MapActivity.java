package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        HashMap<String, String> m = new HashMap<String, String>();

        // Add keys and values (Country, City)
        m.put("Key1", "Item1");
        m.put("Key2", "Item2");
        m.put("Key3", "Item3");

        //Printing it the default way
        System.out.println(m);

        //2 - Call print method to print the map passed as its parameter.
        System.out.println("Printing with different formatting:");
        print(m);

    }

    static void print(HashMap m) {
        //3 - Type code to print this map
        for (Object i : m.keySet()) {
            System.out.println(i + " " + m.get(i));
        }
    }
}
