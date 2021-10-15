package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //1 - Type code to create a list of names. Use ArrayList.
        ArrayList<String> l = new ArrayList<String>();
        l.add("List item 1");
        l.add("List item 2");
        l.add("List item 3");

        //2 - Call print method to print the list passed as its parameter.
        print(l);

    }

    static void print(List l) {
        //3 - Type code to print this list
        //Notice the order in which elements get printed.
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

    }
}
