package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class allStringreverse {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
				list.add("ram");
				list.add("sita");
				list.add("laxman");
		List<String> list1=new ArrayList<String>();
		for(String str : list)
		{
			StringBuffer str2=new StringBuffer(str).reverse();
			String str1=str2.toString();
			list1.add(str1);
		}
		System.out.println(list1);
	    list1.addAll(list);
	    System.out.println(list1);
			
	}

}
