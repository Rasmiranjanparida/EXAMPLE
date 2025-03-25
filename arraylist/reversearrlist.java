package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class reversearrlist {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how many element you want ");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			System.out.print("enter element "+(i+1)+" :");
			String element=sc.nextLine();	
			list.add(element);
		}
		System.out.println("original array list "+list);
		Collections.reverse(list);
		System.out.println("the reverse list is "+list);
		sc.close();
	}

}
