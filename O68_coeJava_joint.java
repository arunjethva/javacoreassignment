package corejava_assignments;

import java.util.ArrayList;

public class O68_coeJava_joint {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);

		System.out.println("List1 " + list1);
		System.out.println("List2 " + list2);

		System.out.println("after joint the lists");
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);

		System.out.println(list3);
	}
}
