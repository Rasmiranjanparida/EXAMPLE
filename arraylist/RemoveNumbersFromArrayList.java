package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumbersFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("12");
        numberList.add("Not a number"); // Adding a non-numeric element
        numberList.add("13");
        numberList.add("15");
        numberList.add("Another non-numeric"); // Adding another non-numeric element
        numberList.removeIf(element -> element instanceof String);
        System.out.println("List after removing numbers: " + numberList);
    }
}