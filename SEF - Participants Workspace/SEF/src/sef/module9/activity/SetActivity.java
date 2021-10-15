package sef.module9.activity;

//Needs to be completed
import java.util.*;


public class SetActivity {

    public static void main(String[] args) {
        //1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.
        TreeSet s = new TreeSet();
        s.add("A");
        s.add("C");
        s.add("B");
        s.add("A"); //TreeSet doesn't allow duplicates, but PriorityQueue does.

        //2 - Call print method to print the set passed as its parameter.
        print(s);

    }

    static void print(TreeSet s) {
        //3 - Type code to print this set
        //Notice the order in which elements get printed.
        Iterator iterator = s.iterator();   //Can also use descendingIterator for the opposite order
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
