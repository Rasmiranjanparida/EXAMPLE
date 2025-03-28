package vector;

public class Aavectordocumentation {
	/*
	 * ----------------------------------------------------------------------
	 *  Vector:
	 * --------
	 * public class Vector<E> extends AbstractList<E> implements List<E>,
	 * Serializable, Clonable, RandomAccess
	 * 
	 * Vector is a predefined class available in java.util package under List
	 * interface.
	 * 
	 * Vector is always from java means it is available from jdk 1.0 version.
	 * 
	 * Vector and Hashtable, these two classes are available from jdk 1.0, remaining
	 * Collection classes were added from 1.2 version. That is the reason Vector and
	 * Hashtable are called legacy(old) classes.
	 * 
	 * The main difference between Vector and ArrayList is, ArrayList methods are
	 * not synchronized so multiple threads can access the method of ArrayList where
	 * as on the other hand most the methods are synchronized in Vector so
	 * performance wise Vector is slow.
	 * 
	 * We should go with ArrayList when Threadsafety is not required on the other
	 * hand we should go with Vector when we need ThreadSafety for reterival
	 * operation.
	 * 
	 * It also stores the elements on index basis.It is dynamically growable with
	 * initial capacity 10. The next capacity will be 20 i.e double of the first
	 * capacity.
	 * 
	 * new capacity = current capacity * 2;
	 * 
	 * Just like ArrayList it also implements List, Serializable, Clonable,
	 * RandomAccess interfaces.
	 * 
	 * Constructors in Vector :
	 *-------------------------
	 * We have 4 types of
	 * Constructor in Vector
	 * 
	 * 1) Vector v1 = new Vector(); It will create the vector object with default
	 * capacity is 10
	 * 
	 * 2) Vector v2 = new Vector(int initialCapacity); Will create the vector object
	 * with user specified capacity.
	 * 
	 * 3) Vector v3 = new Vector(int initialCapacity, int incrementalCapacity);
	 *  Eg:- Vector v = new Vector(1000,5);
	 * 
	 * Initially It will create the Vector Object with initial capacity 1000 and
	 * then when the capacity will be full then increment by 5 so the next capacity
	 * would be 1005, 1010 and so on.
	 * 
	 * 4) Vector v4 = new Vector(Collection c); Interconversion between the
	 * Collection.
	 */
}
