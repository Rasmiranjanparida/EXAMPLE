package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversestring {
	public static void main(String[] args) {
		List<String> str1= new ArrayList<String>();
		List<String>str3=new ArrayList<String>();
		str1.add("ram");
		str1.add("sita");
		str1.add("laxman");
		System.out.println(str1);
		Collections.reverse(str1);
		System.out.println(str1);
		
		for(String i:str1)
		{
			String reversString= m1(i);
			str3.add(reversString);	
		}
		System.out.println(str3);
		
	}
	public static String m1(String str)
	{
		char []arr=str.toCharArray();
		String str2=" ";
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	str2+=arr[i];
	    }
		return str2;
	}

}
