package AssistedPractice.differentCollections;

import java.util.*;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 20/07/22
 * Time: 14:38
 */


public class DifferentCollections {
    public static void main(String[] args) {

        System.out.println("\n*-*-*-*-*--*-LinkedList Section Starts-*-*-*-*-*-*\n");
        LinkedList<String> LL = new LinkedList<String>();

        LL.add("First Inserted String");        // adding first string in the linkedList
        LL.add("Second Inserted String");       // adding second string in the linkedList

        ListIterator<String> itrator = LL.listIterator();
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }

        LL.remove();        // removing head element from the linkedList
        System.out.println("\nAfter removing first element, aka Head, from the LinkedList:");
        itrator = LL.listIterator();
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }

        System.out.println("\n*-*-*-*-*--*-LinkedList Section Ends-*-*-*-*-*-*\n");


        System.out.println("\n*-*-*-*-*--*-ArrayList Section Starts-*-*-*-*-*-*\n");

        ArrayList<String> AL = new ArrayList<String>();
        AL.add("First Inserted String");        // adding first string in the ArrayList
        AL.add("Second Inserted String");       // adding second string in the ArrayList

        itrator = AL.listIterator();
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }

        AL.remove(1);        // removing second element from the ArrayList
        System.out.println("\nAfter removing Second element from the ArrayList:");
        itrator = AL.listIterator();
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }
        System.out.println("\n*-*-*-*-*--*-ArrayList Section Ends-*-*-*-*-*-*\n");




        System.out.println("\n*-*-*-*-*--*-HashSet Section Starts-*-*-*-*-*-*\n");

        HashSet<String> HS = new HashSet<String>();
        HS.add("First Inserted String");        // adding first string in the HashSet
        HS.add("Second Inserted String");       // adding second string in the HashSet

        System.out.println(HS);

        HS.remove("First Inserted String");        // removing first string from the HashSet
        System.out.println("\nAfter removing first string from the HashSet:");
        System.out.println(HS);

        System.out.println("\n*-*-*-*-*--*-HashSet Section Ends-*-*-*-*-*-*\n");


        System.out.println("\n*-*-*-*-*--*-LinkedHashSet Section Starts-*-*-*-*-*-*\n");

        LinkedHashSet<String> LHS = new LinkedHashSet<String>();
        LHS.add("First Inserted String");        // adding first string in the LinkedHashSet
        LHS.add("Second Inserted String");       // adding second string in the LinkedHashSet

        System.out.println(LHS);

        LHS.remove("Second Inserted String");        // removing first string from the LinkedHashSet
        System.out.println("\nAfter removing second string from the LinkedHashSet:");
        System.out.println(LHS);

        System.out.println("\n*-*-*-*-*--*-HashLinkedHashSetSet Section Ends-*-*-*-*-*-*\n");


    }
}
