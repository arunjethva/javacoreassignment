package corejava_assignments;

import java.util.ArrayList;

public class O74_coreJava_position {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("The list is :" + list);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}
	}

}
