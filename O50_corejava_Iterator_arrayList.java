package corejava_assignments;

import java.util.ArrayList;

public class O50_corejava_Iterator_arrayList {

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

		for (int i : list) {
			System.out.println(i);
		}

	}

}
