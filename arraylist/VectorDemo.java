package arraylist;

import java.util.Vector;

public class VectorDemo {
	    public static void main(String args[]) {
	        // Creating a Vector with an initial capacity of 4 and increment of 2
	      Vector<Integer> obj=new Vector<Integer>(4,2) ; 
	      obj.addElement(2);
	      obj.addElement(4);
	      obj.addElement(5);
	      System.out.println(obj.elementAt(2)); 
	    }
	}
