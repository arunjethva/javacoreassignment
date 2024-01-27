package corejava_assignments;

import java.util.ArrayList;

public class O75_coreJava_compare {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		System.out.println("set1 :" + list1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(60);
		list2.add(10);
		list2.add(80);
		list2.add(20);
		list2.add(100);

		System.out.println("Set2 :" + list2);

		list1.retainAll(list2);

		System.out.println("The same Elements is :" + list1);
		

	}

}
