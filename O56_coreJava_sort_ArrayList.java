package corejava_assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class O56_coreJava_sort_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(100);
		list.add(45);
		list.add(16);
		list.add(98);
		list.add(8);
		list.add(81);
		list.add(46);
		list.add(16);
		list.add(66);
		list.add(45);

		System.out.println("befor sorting ...");
		System.out.println(list);
		
		System.out.println("after sorting ...");
		Collections.sort(list);
		System.out.println(list);
	}
}
