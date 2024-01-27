package corejava_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class O57_CcoreJava_copy {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);

		System.out.println("Before copy");
		System.out.println("list1  :" + list1);
		System.out.println("list2  :" + list2);

		Collections.copy(list1, list2);
		

		System.out.println("After copy");
		
		System.out.println("list1 :" + list1);
		System.out.println("list2 :" + list2);
	}

}
