package arraylist;

public class Aa_documentation {

	/*
	 * -----------------------------------------------------------------------
	 * ArrayList : ----------- public class ArrayList<E> extends AbstractList<E>
	 * implements List<E>, Serializable, Clonable, RandomAccess
	 * 
	 * It is a predefined class available in java.util package under List interface.
	 * 
	 * It accepts duplicate elements and null values.
	 * 
	 * It is dynamically growable array.
	 * 
	 * It stores the elements on index basis so it is simillar to dynamic array.
	 * 
	 * Initial capacity of ArrayList is 10. The new capacity of Arraylist can be
	 * calculated by using the formula new capacity = (current capacity * 3/2) + 1
	 * 
	 * All the methods declared inside an ArrayList is not synchronized so multiple
	 * thread can access the method of ArrayList.
	 * 
	 * It is highly suitable for fetching or retriving operation when duplicates are
	 * allowed and Thread-safety is not required.
	 * 
	 * It implements List,Serializable, Clonable, RandomAccess interfcaes
	 * 
	 * Constructor of ArrayList :
	 * -------------------------------------------------------------------- In
	 * ArrayList we have 3 types of Constructor: Constructor of ArrayList :
	 * --------------------------------------------------------------------- 1)
	 * ArrayList al1 = new ArrayList(); Will create ArrayList object with default
	 * capacity 10.
	 * 
	 * 2) ArrayList al2 = new ArrayList(int initialCapacity); Will create an
	 * ArrayList object with user specified Capacity
	 * 
	 * 3) ArrayList al3 = new ArrayList(Collection c) We can copy any Collection
	 * interface implemented class data to the current object reference (Coping one
	 * Collection data to another)
	 * 
	 * ----------------------------------------------------------------------
	 * Limitation of ArrayList : 
	 * ------------------------- 
	 * The time complexcity of ArrayList to insert and delete an element from the middle would be O(n)
	 * because 'n' number of elements will be re-located so it is not a good choice
	 * to perform insertion and deletion operation in the middle of the List.
	 * 
	 * On the other hand ArryList is good choice for retrieval operation because by
	 * using index we can retrieve the element in O(1).
	 * 
	 * To avoid this we introduced LinkedList.
	 */

}
