package arraylist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class useingIterator {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		/*Iterator<Integer> iterator=list.iterator();
		while (iterator.hasNext()) {
		     int number= iterator.next();
		     System.out.println(number);
		}
		for (int i=0;i<list.size();i++) {
			int number1=list.get(i);
		    System.out.println(number1);
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		ListIterator<Integer> listIterator= list.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = listIterator.next();
			System.out.println(integer);
			
		}
		ListIterator<Integer>listIterator2= list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			Integer integer = listIterator2.previous();
			System.out.println(integer);
			
		}
		
		list.forEach(i->System.out.println(i));
		
		list.forEach(System.out :: println);
		
		Vector<Integer> v= new Vector<Integer>(list);
		Enumeration<Integer> enm= v.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
			
			
		}
*/
	}

}
