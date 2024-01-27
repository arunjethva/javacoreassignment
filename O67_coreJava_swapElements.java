package corejava_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class O67_coreJava_swapElements {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Arun");
		list.add("Janak");
		list.add("dixit");
		list.add("sahil");
		list.add("dishant");
		list.add("mayank");

		System.out.println("Before Swapping" + list);
		
		Collections.swap(list, 0,4 );
		System.out.println("After Swapping " + list);

	}

}
