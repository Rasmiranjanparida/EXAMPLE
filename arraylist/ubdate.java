package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ubdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want ");
		int size = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.print("enter element " + (i + 1) + " :");
			int element = sc.nextInt();
			list.add(element);
		}
		System.out.println("original array list " + list);
		System.out.println("how many number you want enter ");
		int want=sc.nextInt();
		for(int i=0;i<want;i++)
		{
			System.out.println("enter number ");
			int ubdate=sc.nextInt();
			System.out.print("enter a index to ubdate ");
			int index=sc.nextInt();
		    list.set(index,ubdate);
		}
		System.out.println("ArrayList after insertion:"+list);
	}

}
