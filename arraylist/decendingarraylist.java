package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class decendingarraylist {

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
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("here array list in accending order " + list);

	}

}
