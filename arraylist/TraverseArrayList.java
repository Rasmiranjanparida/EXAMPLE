package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TraverseArrayList {
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        System.out.println("Forward traversal:");
        forwardTraversal(arrayList);
        System.out.println("\nBackward traversal:");
        backwardTraversal(arrayList);
    }
    private static void forwardTraversal(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
    private static void backwardTraversal(ArrayList<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}