package corejava_assignments;

import java.util.ArrayList;

public class O55_corwJava_search {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		System.out.println(list);

		if (list.contains(50)) {
			System.out.println("The seach alement is found in list ");
		} else {
			System.out.println("The search element is not found ");
		}

	}

}
