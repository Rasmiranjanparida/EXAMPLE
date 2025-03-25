package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class deletearraylist {
	public static void main(String[] args) {
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
		for(int i=1;i<=want;i++)
		{
			System.out.println("enter number to delete");
			int delete=sc.nextInt();
			list.remove(Integer.valueOf(delete));
		}
		System.out.println("ArrayList after insertion:"+list);
	}

	}


