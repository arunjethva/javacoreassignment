package corejava_assignments;

import java.util.ArrayList;

public class O73_coreJava_Replace {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("The ArrayList is :" + list);

		list.add(1, 100);
		System.out.println("After Changing the Secand element :" + list);

	}

}
